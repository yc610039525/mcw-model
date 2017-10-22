SELECT
  LEAST(sysdate,'10-10月-08')
FROM DUAL;

LEAST(expr1,expr2,...)
获取参数中的最小值

GREATEST(expr1,expr2,...)
获取参数中的最大值

查看每个员工的入职时间，若是82年以后入职的，就显示其
入职时间，若是82年以前入职的，就显示为82年1月1号

SELECT 
  ename,GREATEST(hiredate,TO_DATE('1982-01-01','YYYY-MM-DD'))
FROM emp_csy