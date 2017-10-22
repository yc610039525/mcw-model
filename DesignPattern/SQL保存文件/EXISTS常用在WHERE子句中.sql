EXISTS常用在WHERE子句中，含义是：
EXISTS后面的子查询只要能查询出至少一条记录，那么EXISTS
的返回值就为TRUE

查询有员工的部门都有哪些？
SELECT deptno,dname
FROM dept_csy d
WHERE EXISTS(SELECT*FROM emp_csy e
              WHERE d.deptno = e.deptno);
该子查询的意义在于：用DEPT表中每一条记录的deptno的值
作为条件去emp表中查询是否有记录，有EXISTS就满足条件。