ALL和ANY
ANY与ALL常用在比较>,>=,<,<=一个列表中的值
>ANY:大于列表中最小的即可
>ALL:大于列表中最大的
<ANY:小于列表中最大的即可
<ALL:小于列表中最小的
通常使用ANY或者ALL，列表中不会给固定值。而是用在
子查询中。

SELECT
 empno,ename,job,sal,deptno
FROM emp_csy
WHWRE
  sal>ALL(3000,4000,5000);