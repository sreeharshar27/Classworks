drop table if exists students;
create table  students(stuid int, stuname String, course String, grp String, age int, year_of_study int)    
 partitioned by (address String) 
 ROW FORMAT DELIMITED FIELDS TERMINATED by ','
 LINES TERMINATED BY '\n'
 STORED AS TEXTFILE;


