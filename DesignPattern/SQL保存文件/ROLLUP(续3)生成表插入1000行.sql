ROLLUP(续3)生成表插入1000行

CREATE TABLE sales_csy(
  year_id NUMBER NOT NULL,
  month_id NUMBER NOT NULL,
  day_id NUMBER NOT NULL,
  sales_value NUMBER(10,2)NOT NULL);
  
  INSERT INTO sales_csy
  SELECT TRUNC(DBMS_RANDOM.value(2010,2012))AS year_id,
    TRUNC(DBMS_RANDOM.value(1,13))AS month_id,
    TRUNC(DBMS_RANDOM.value(1,32))AS day_id,
    ROUND(DBMS_RANDOM.value(1,100),2)AS sales_value
  FROM dual
  CONNECT BY level<=1000;
  