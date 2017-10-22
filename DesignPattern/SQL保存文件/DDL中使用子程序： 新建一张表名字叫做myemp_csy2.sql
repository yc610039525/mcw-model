DDL中使用子程序：
新建一张表名字叫做myemp_csy2
该表字段：
  empno,ename,sal,deptno
数据是emp表中 10,20号部门的所有员工信息

CREATE TABLE myemp_csy2
AS
SELECT empno eno,ename,sal,deptno
FROM emp_csy
WHERE deptno IN (10,20)

使用子查询构建表，那么表的字段就是字查询中SELECT中
列举的字段，字段名一致。若希望字段名不一致，可以在
SELECT语句中列举的字段后面添加别名。但是类型不会改变。
当使用子查询构建表后，表中是有数据的，数据就是这条子查询
查询出来的所有结果。

哪些员工比公司的平均工资高
SELECT e.ename,e.sal
FROM emp_csy e
WHERE sal>(SELECT 
              AVG(sal)
              FROM emp_csy)

查看与SALESMAN相同部门，但不是SALESMAN的员工信息
列出:名字，薪水，职位，部门编号
SELECT e.deptno
FROM emp_csy e
WHERE job = 'SALESMAN'

当查询结果为一个多行单列时，那么在判断是否相等就不能
使用"="，因为值有好几个，我们只能选择等于其中之一。那么
这个时候就要使用到IN

SELECT ename,sal,job,deptno
FROM emp_csy
WHERE deptno IN(SELECT deptno
                FROM emp_csy
                WHERE job='SALESMAN')
AND job <>'SALESMAN'

列出比所有SALESMAN工资都高的员工信息？
SELECT sal,job
FROM emp_csy
WHERE job='SALESMAN'

SELECT ename,job,sal
FROM emp_csy
WHERE sal >ALL (SELECT sal
                FROM emp_csy
                WHERE job = 'SALESMAN')

若子查询是单行单列的，那么在WHERE中可以使用的比较运算
=,>,>=,<,<=,<>

若子查询是多行多列的，可以使用的：
IN,NOT IN,(>,>=,<,<=)ALL|ANY