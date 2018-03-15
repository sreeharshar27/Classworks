/*
   Using Java User Defined Functions in Pigscripts..
   Example.
   @author: anishkumar.
*/


REGISTER Capital.jar;

DEFINE CapitalizeWord com.htc.pig.udf.WordFirstLetterCapitalCase();

 --Loads the data into hdfs
policydata = LOAD 'hdfs://quickstart.cloudera:8020/piginputs/policydata.txt'
             USING PigStorage(',') 
             AS (policyno:int,
                 policyholdername:chararray,
                 lob:chararray,
                 issuedate:chararray,
                 policymode:chararray,
                 premium:double,
                 state:chararray,
                 remarks:chararray);

p = FOREACH policydata GENERATE policyno, CapitalizeWord(policyholdername), lob, premium;

DUMP p;

---   end of script -----

