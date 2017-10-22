
GROUP BY子句
GROUP BY子句可以按照给定的字段值相同的记录划分为一组。
然后使用聚合函数进行统计结果。
不使用GROUP BY子句，那么整张表所有记录看做一组。

查看每个部门的最大工资，最小工资等：
SELECT
  deptno,MAX(sal),MIN(sal),SUM(sal),AVG(sal)
FROM emp_csy
GROUP BY deptno

GROUP BY子句也可以按照多列进行分组，那么就是这几列的
值都相同的看做一组。

查看同部门同职位的员工的最大工资，最小工资等：
SELECT
  deptno,job,MAX(sal),MIN(sal),SUM(sal),AVG(sal)
FROM emp_csy
GROUP BY deptno,job

在SELECT子句中，若有组函数，那么不在组函数中的其他字段
必须出现在GROUP BY子句中。但是反过来没有要求。


查看哪个部门的最高薪水大于4000，列出该部门编号，与最大薪水。
SELECT
  deptno,MAX(sal)
FROM emp_csy
WHERE sal>4000
GROUP BY deptno

查看哪个部门的平均工资高于2200，列出该部门编号与平均工资
SELECT
  deptno,AVG(sal)
FROM emp_csy
GROUP BY deptno
HAVING AVG(sal)>2200