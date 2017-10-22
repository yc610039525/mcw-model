LAST_DAY(date)返回给定日期所在月的最后一天。返回值依然
是一个DATE类型

查看当月月底日期
SELECT
  LAST_DAY(sysdate)
FROM DUAL

查看每个员工入职当月的月底
SELECT
  ename,LAST_DAY(hiredate+100)
FROM emp_csy

日期也可以加一个数字，该数字表示天数


查看2007年2月的月底是哪天？
SELECT
  LAST_DAY(TO_DATE('2007-02-01','YYYY-MM-DD'))
FROM DUAL