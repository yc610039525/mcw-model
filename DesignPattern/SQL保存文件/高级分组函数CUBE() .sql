高级分组函数CUBE()

SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY CUBE(year_id,month_id,day_id)
ORDER BY year_id,month_id,day_id


可以按照给定的组合方式进行分组统计，然后将结果并在一起返回。

SELECT
  year_id,month_id,day_id,SUM(sales_value)
FROM
  sales_csy
GROUP BY 
  GROUPING SETS(
  (year_id,month_id,day_id),
  (year_id,month_id))
ORDER BY
  year_id,month_id,day_id