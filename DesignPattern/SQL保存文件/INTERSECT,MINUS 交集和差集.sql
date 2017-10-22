INTERSECT,MINUS
交集和差集
集合操作要求两条SELECT语句查询的字段要完全一样：

SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
INTERSECT
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;


SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
MINUS
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;