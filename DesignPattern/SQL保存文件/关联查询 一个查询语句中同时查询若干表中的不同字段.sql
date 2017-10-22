关联查询
一个查询语句中同时查询若干表中的不同字段

应当注意，N张表关联查询至少应当有N-1个连接条件。

若不添加连接条件，数据库会将两张表中的记录逐一连接。这样
会产生大量的无效关联，造成性能浪费，严重时可能导致系统瘫痪。
这样的无用连接出来的结果集称为“笛卡尔积”

查看每个员工的名字，工资，部门编号，以及部门名称
SELECT
  e.ename,e.sal,e.deptno,d.dname
FROM emp_csy e,dept_csy d
WHERE e.deptno=d.deptno

查询SALES部门的员工都有谁？
SELECT
  e.ename,e.deptno,d.dname
FROM emp_csy e,dept_csy d
WHERE e.deptno=d.deptno AND d.dname='SALES'

内连接，也是作为关联连接
内连接使用JOIN连接两张表，并且将连接条件定义在ON子句中

查看每个员工的信息，及部门名
SELECT
  e.ename,d.dname
FROM
  emp_csy e JOIN dept_csy d
ON
  e.deptno=d.deptno
ORDER BY d.dname
WHERE
  d.deptno='SALES'

查询后发现，emp表中没有出现KING，dept表中部门名称为
OPERATIONS的记录也没有出现过。
原因在于，我们进行关联查询时，他们都不满足连接条件。
  
JOIN会将连接条件单独定义在ON子句上，那么WHERE就可以
只定义过滤条件，使得多表关联查询时可读性更高。

当我们需要在关联查询时，注意显示一张表中的所有数据时（包括不满足连接条件的数据），
我们可以使用外连接来解决。
那么不满足连接条件的记录中，主表（驱动表）中对应的字段可以
显示，那么对应的连接表中由于不满足连接条件，该表中的字段
值全部为NULL。

SELECT
  e.ename,e.sal,d.dname,d.loc
FROM
  emp_csy e FULL OUTER JOIN dept_csy d
ON
  e.deptno=d.deptno()
  


SELECT
  e.ename,e.sal,d.dname,d.loc
FROM
  emp_csy e,dept_csy d
WHERE
  e.deptno=d.deptno(+)
  
  
SELECT
  e.ename"员工",m.ename"领导"
FROM
  emp_csy e,emp_csy m
WHERE
  e.mgr=m.empno
