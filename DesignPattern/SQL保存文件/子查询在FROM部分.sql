子查询在FROM部分
当做表使用

查看比本部门平均薪水高的员工？

1:每个部门的平均薪水？
SELECT deptno,AVG(sal) avg_sal
FROM emp_csy
GROUP BY deptno

2:做实际查询
SELECT e.ename,e.sal,e.deptno
FROM emp_csy e,(SELECT deptno,AVG(sal) avg_sal
                FROM emp_csy
                GROUP BY deptno) t
WHERE e.deptno=t.deptno
AND e.sal>t.avg_sal

多行多列子查询通常在FROM子句中被当做一个表看待，为外层
查询提供数据使用。
在FROM中直接使用子查询作为一张表看待，一般叫做“内视图”

