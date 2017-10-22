UNION,UNION ALL
并集合全并集
集合操作要求两条SELECT语句查询的字段要完全一样：

合并职位是'MANAGER' 的员工和薪水大于2500的员工
集合，查看两种方式的结果差别
SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
UNION
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;

SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
UNION ALL
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;