�߼����麯��CUBE()

SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY CUBE(year_id,month_id,day_id)
ORDER BY year_id,month_id,day_id


���԰��ո�������Ϸ�ʽ���з���ͳ�ƣ�Ȼ�󽫽������һ�𷵻ء�

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