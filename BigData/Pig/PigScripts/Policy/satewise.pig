/*
   Script to find statewise total premium.
   @author: anishkumar.
*/

 --Loads the data into hdfs
policydata = LOAD 'hdfs://quickstart.cloudera:8020/piginputs/policydata.txt'
             USING PigStorage(',') 
             AS (policno:int,
                 policyholdername:chararray,
                 lob:chararray,
                 issuedate:chararray,
                 policymode:chararray,
                 premium:double,
                 state:chararray,
                 remarks:chararray);

   -- group the data using state
policydata_group = GROUP policydata BY state;
 
   --Generate transformation...

statewise_policydata = FOREACH policydata_group GENERATE group, 
                                                         SUM(policydata.premium) AS TotalPremium, 
                                                         COUNT(policydata) AS PolicyCount;

dump statewise_policydata;   -- Final output.

---   end of script -----

