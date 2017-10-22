分组函数，聚合函数，多行函数
作用，将一组数据进行统计，得出一个结果。

MAX(),MIN()求最大值与最小值

查看公司最高工资与最低工资分别是多少：
SELECT
  MAX(sal),MIN(sal)
FROM emp_csy

SUM(),AVG()分别统计总和与平均值

查看公司员工工资总和，与平均工资：
SELECT
  SUM(sal),AVG(sal)
FROM emp_csy

在分组函数中，NULL值是被忽略的。
SELECT
  SUM(comm),AVG(NVL(comm,0))
FROM emp_csy