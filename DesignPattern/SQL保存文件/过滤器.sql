WHERE 过滤器，过滤不满足条件的部分内容
两个日期相减差是相隔的天数
SELECT
  ename,hiredate
FROM emp_csy
WHERE
  hiredate>
  TO_DATE('1987-01-01','YYYY-MM-DD');