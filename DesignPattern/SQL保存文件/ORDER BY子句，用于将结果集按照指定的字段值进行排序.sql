ORDER BY子句，用于将结果集按照指定的字段值进行排序
ORDER BY子句只能写在SELECT语句的最后。
ORDER BY的排序方式有两种：升序，降序
默认就是升序，若希望使用降序可以使用DESC。

查看公司员工的工资情况,从少到多
SELECT
  ename,sal
FROM emp_csy
ORDER BY
  sal DESC
  
ORDER BY 可以根据多个字段进行排序，排序的优先级是
先按照第一个字段排序，在这个基础上再按照第二个字段的
值进行排序。
所以，若第一个字段的值没有重复的，那么对第二个字段的
排序就没有意义。

SELECT
  ename,deptno,sal
FROM emp_csy
ORDER BY
  deptno,sal DESC
  
若排序的字段中包含NULL值，那么NULL被视作最大值
SELECT
  ename,comm
FROM emp_csy
ORDER BY
comm