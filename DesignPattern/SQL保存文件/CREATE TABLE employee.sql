CREATE TABLE employee_csy(
  id NUMBER(4),
  name VARCHAR2(20) NOT NULL,
  gender CHAR(1) DEFAULT 'M',
  birth DATE,
  salary NUMBER(6,2),
  job VARCHAR2(30),
  deptno NUMBER(2)
  )
