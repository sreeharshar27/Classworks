/*
  Select Policy/Vehicles details with more than two coverages.
  @Author:  Anish Kmar
*/

-- Loading policy data
policydata = LOAD '/piginputs/policydata.txt' 
             USING PigStorage(',') 
             AS (policyno:int,
                 policyHolderName:chararray,
                 lob:chararray,
                 issuedate:chararray,
                 policymode:chararray,
                 premium:double,
                 state:chararray,
                 remarks:chararray);

--Loading coverages data.
coveragesdata = LOAD 'hdfs://quickstart.cloudera:8020/piginputs/coveragesdata.txt' 
                USING PigStorage(',')
                AS (policyno:int,
                    coveragetype:chararray,
                    mincoverage:double,
                    maxcoverage:double);

-- Join two relations (inner join)
policy_coverages_join = JOIN policydata BY policyno, coveragesdata BY policyno;

-- Find policies with more than two coverages.
grouped_policy_coverages = GROUP policy_coverages_join BY policydata::policyno;

policy_coverage_count = FOREACH grouped_policy_coverages GENERATE group,
                                    FLATTEN(policy_coverages_join.policydata::policyHolderName),
									FLATTEN(policy_coverages_join.policydata::lob),	
                                    COUNT(policy_coverages_join) AS CoveragesCount;

policy_coverages_morethantwo = FILTER policy_coverage_count BY CoveragesCount > 2;

DUMP policy_coverages_morethantwo;

-- end of the script --