子查询：
当前查询是基于另一次查询的结果基础之上进行的。那么前期
执行的那次查询称为子查询。它是嵌入在实际查询中的。

查看和SCOTT相同部门的员工？
1：查看SCOTT的部门是哪个？
2：根据SCOTT的部门编号作为条件，查询和他相同的员工信息

SELECT deptno
FROM emp_csy
WHERE ename='SCOTT'

SELECT ename,job,sal,deptno
FROM emp_csy
WHERE deptno=(SELECT deptno
              FROM emp_csy
              WHERE ename='SCOTT')
AND ename<>'SCOTT'