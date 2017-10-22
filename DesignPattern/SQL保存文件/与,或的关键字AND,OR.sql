AND和OR，用来连续多个查询条件
AND：两个条件都为true时，才为true
OR：两个条件都为false时，才为false

查询薪水大于1000并且职位是'CLERK' 的职员信息
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1000 AND job='CLERK';

查询薪水大于1000或职位是'CLERK'的职员信息
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1000 OR job='CLERK';

查看工资高于1250的CLERK和SALESMAN：
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1250 AND (job='CLERK' OR job='SALESMAN');

AND的优先级低于OR
