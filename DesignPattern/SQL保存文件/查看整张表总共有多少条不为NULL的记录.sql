COUNT():该函数不关注给定的字段的取值，值统计该字段不为
NULL的记录总共有多少条。
若希望统计整张表中数据总共多少条，通常写成COUNT(*)

查看comm字段不为NULL的记录总共有多少条：
SELECT COUNT(comm)
FROM emp

查看整张表总共有多少条记录：
SELECT COUNT(*)
FROM emp_csy