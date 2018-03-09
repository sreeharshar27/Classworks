/*
   Product sold in each country.
   @Author :aNish kuimar   
*/

salesdata = LOAD '/piginputs/SalesJan2009.csv' 
            USING PigStorage(',')
            AS (transactionDate:datetime,
                product:chararray,
                price:double,
                paymenttype:chararray,
                name:chararray,
                city:chararray,
                state:chararray,
                country:chararray,
                accountcreated:chararray,
                lastlogin:chararray,
                latitue:chararray,
                longitude:chararray);

grouped_sales_data = GROUP salesdata BY country;

sales_output = FOREACH grouped_sales_data GENERATE 
                                UPPER(group)         AS Country, 
                                COUNT(salesdata)     AS Product_Sold,
                                SUM(salesdata.price) AS Total_Revenue;
 
sales_output_order = ORDER sales_output BY Total_Revenue DESC, Product_Sold  DESC;
DUMP sales_output_order;
