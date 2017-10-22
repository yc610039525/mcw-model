LIKE模糊查询
LIKE中的字符串可以包含两种通配符
_:表示任意一个字符
%:表示任意个字符(0-多个)

查看名字第二个字母是"A"的员工信息
SELECT ename,job
FROM emp_csy
WHERE ename LIKE'_A%';