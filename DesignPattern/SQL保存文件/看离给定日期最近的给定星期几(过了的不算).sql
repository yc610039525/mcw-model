SELECT ename,
  ADD_MONTHS(hiredate,20*12)
FROM emp_csy;

查看每个人到目前为止工作了多少个月？
SELECT ename,
  MONTHS_BETWEEN(sysdate,hiredate)
FROM emp_csy;


看离给定日期最近的给定星期几(过了的不算)
第二个参数可以是字符串，但是不推荐，因为有语言区别。
第二个参数也可以是数字，推荐使用数字，但是需要注意的是
1表示星期日，2表示星期一，以此类推。
该函数不是用来返回明天是哪天...
SELECT 
  NEXT_DAY(sysdate,7)
FROM DUAL;