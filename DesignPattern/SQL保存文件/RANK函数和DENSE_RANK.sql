RANK������DENSE_RANK

RANK����������һ�����ڲ���������Ψһ�����֡�
SELECT
  ename,sal,deptno,
  RANK()
  OVER(PARTITION BY deptno ORDER BY sal) rank
FROM emp_csy

DENSE_RANK����������������Ψһ�����֣�
SELECT
  ename,sal,deptno,
  DENSE_RANK()
  OVER(PARTITION BY deptno ORDER BY sal) rank
FROM emp_csy