SELECT子句中也可以使用子查询：
把子查询放在SELECT子句部分，可以认为是外连接的另
一种表现形式，使用更灵活

SELECT e.ename,e.sal,
      (SELECT d.dname FROM dept_csy d
      WHERE d.deptno = 50) dname
FROM emp_csy e;