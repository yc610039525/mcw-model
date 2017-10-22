排序函数 ROW_NUMBER

按照指定的字段分组，并按照指定的字段排序后，生成一个组内
连续且唯一的数字：
按照部门分组，按照工资进行升序排序，生成组内连续且唯一的数字

SELECT
  ename,sal,deptno,
  ROW_NUMBER()
  OVER (PARTITION　BY deptno ORDER BY sal) rank
FROM emp_csy