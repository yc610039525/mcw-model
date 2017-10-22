WHERE子句
SELECT语句中可以添加WHERE子句来限定查询的结果集。
这样我们可以只检索满足WHERE子句要求的记录，而不是整张
表中所有记录。

数据库在检索表的时候，每当检索一条记录时，就会判断
WHERE条件，来查看该记录是否满足要求，满足就保留，否则
忽略。

所以WHERE是在查询表的过程中进行过滤的，每一条记录都要
经过WHERE的判断。
SELECT ename,sal
FROM emp_csy
WHERE sal<2000;

SELECT ename,sal,job
FROM emp_csy
WHERE deptno<>10;

查询员工1982年1月1日以后入职的职员
SELECT ename,sal,hiredate
FROM emp_csy
WHERE hiredate>TO_DATE('1982-01-01','YYYY-MM-DD');