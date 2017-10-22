EXTRACT(date FROM datetime)
提取一个日期中指定时间分量对应的值
Date类型的，可以提取年月日
时间戳类型的，还可以提取时分秒

SELECT
  EXTRACT(YEAR FROM SYSDATE)
FROM DUAL;