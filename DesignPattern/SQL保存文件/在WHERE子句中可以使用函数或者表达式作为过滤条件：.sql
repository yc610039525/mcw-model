在WHERE子句中可以使用函数或者表达式作为过滤条件：
SELECT
  ename,sal,job
FROM emp_csy
WHERE
  ename = UPPER('rose');
  
SELECT
  ename,sal,job
FROM emp_csy
WHERE sal*12 >50000;