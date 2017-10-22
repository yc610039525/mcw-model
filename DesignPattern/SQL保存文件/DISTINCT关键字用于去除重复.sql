DISTINCT关键字用于去除重复



DISTINCT关键字用于指定查询结果集中给定的列去除重复行查看
不重复的职位有哪些：
SELECT
  DISTINCT job
FROM emp_csy

若使用DISTINCT对多个列进行去重，那么查询的结果集中
这几列值的组合没有重复的。
下面的结果集中，相同部门且相同职位的不会有重复：

SELECT
  DISTINCT deptno,job
FROM emp_csy