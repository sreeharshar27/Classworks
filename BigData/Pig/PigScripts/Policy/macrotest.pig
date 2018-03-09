DEFINE max_by_group(inputData, groupField, maxField) RETURNS result {

	groupedData = GROUP $inputData BY $groupField;
	$result = FOREACH groupedData GENERATE group, MAX($inputData.$maxField);

};

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


state_max_premium = max_by_group(policydata, state, premium); 
dump state_max_premium;

