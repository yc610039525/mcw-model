RANK函数和DENSE_RANK

RANK函数，生成一个组内不连续，不唯一的数字。
SELECT
  ename,sal,deptno,
  RANK()
  OVER(PARTITION BY deptno ORDER BY sal) rank
FROM emp_csy

DENSE_RANK生成组内连续但不唯一的数字：
SELECT
  ename,sal,deptno,
  DENSE_RANK()
  OVER(PARTITION BY deptno ORDER BY sal) rank
FROM emp_csy