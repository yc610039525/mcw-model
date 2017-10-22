ROLLUP分组函数

查看每天的营业额？
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id,day_id
ORDER BY year_id,month_id,day_id

查看每月的营业额？
年，月都相同的记录看做一组，将这些记录的sales_value
求和显示即可。
SELECT year_id,month_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id
ORDER BY year_id,month_id

查看每年的营业额？
SELECT year_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id
ORDER BY year_id

查看总共的营业额？
SELECT SUM(sales_value)
FROM sales_csy000


上面4条SQL语句的特点是，GROUP BY中从
year_id,month_id,day_id进行分组，并逐个减少，直到一个都没有。
并且希望将上面4条SQL语句的程序结果并在一起作为一个结果返回。

ROLLUP分组函数
在GROUP BY啊后面使用ROLLUP函数进行分组，达到的效果就是，ROLLUP中的
参数逐个递减分别分组，然后将所有
的结果并在一起显示，所以下面的程序等效于上面4句查询的
所有结果。

SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id,day_id
ORDER BY year_id,month_id,day_id
