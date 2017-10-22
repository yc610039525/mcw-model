ROWNUM
伪列，该字段可以出现在SELECT语句中，并不是真实存在于表
中的字段。当我们在SELECT中查询该字段，实际上ORACLE会
将表中每查询一条数据，就将行号作为该字段的值。从1开始。

SELECT ROWNUM,ename,sal,deptno
FROM emp_csy

查看第6条以后的数据
需要注意：ROWNUM只有在SELECT语句中每当查询出一条数据
        后才会自增。所以，上来不要使用ROWNUM做 >1的
        判断。
SELECT ROWNUM,ename,sal,deptno
FROM emp_csy
WHERE ROWNUM <>6

先编号后排序编号会混乱（无排序要求）
SELECT *
FROM(SELECT ROWNUM rn,ename,sal,deptno
    FROM emp_csy) t
WHERE t.rn>=6
ORDER BY sal

若在分页的基础上，还有排序的要求。那么我们在分页查询中
需要三次查询来完成。
1：确定实际数据的同时排序
2：编号
3：根据编号取范围

列出按照工资升序排序后，第6条-第10条的员工信息

SELECT *
FROM (SELECT ROWNUM rn,t.*
      FROM (SELECT ename,sal,deptno
            FROM emp_csy
            ORDER BY sal) t)
WHERE rn BETWEEN 6 AND 10

一页显示5条，显示第3页。
pageSize:每页显示的条目数
page    :页数

start:(page-1)*pageSize+1
end:pageSiz*page