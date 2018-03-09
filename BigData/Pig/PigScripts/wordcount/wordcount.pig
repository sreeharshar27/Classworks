/*
  WordCount program..
  @Author Anish
*/

--LOAD the file
file = LOAD '$inputfile' USING TextLoader();

-- Split reach line in the file
words = FOREACH file GENERATE FLATTEN(TOKENIZE($0)) AS word;

-- group by identical words
word_groups = GROUP words by word;

--count each group
wordcount = FOREACH word_groups GENERATE group, COUNT(words);

ordered_output = ORDER wordcount BY group ASC;

DUMP ordered_output;


