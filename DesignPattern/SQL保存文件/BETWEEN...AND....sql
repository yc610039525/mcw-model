BETWEEN...AND...
判断某个字段的值是否在给定的区间内。
小的区间(1500)写在前面，大的(3000)写在后面

查看工资在1500到3000之间的员工信息，包含1500和3000
SELECT
  ename,sal
FROM
  emp_csy
WHERE
  sal BETWEEN 1500 AND 3000;