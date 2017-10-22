HAVING子句，只能跟在GROUP BY子句之后，作用是在
使用分组并统计出结果的基础上进行二次过滤的。
在HAVING子句中可以使用组函数作为过滤条件。

与WHWRE的区别：
WHERE是在第一次查表的过程中，作为过滤条件使用，
HAVING实在第一次查询后，得到统计结果的基础上二次过滤的

查看哪个部门的平均工资高于2200，列出该部门编号与平均工资
SELECT
  deptno,AVG(sal)
FROM emp_csy
GROUP BY deptno
HAVING AVG(sal)>2200