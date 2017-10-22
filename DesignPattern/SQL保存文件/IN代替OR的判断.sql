IN可以判断值是否是列表中的其中之一。
比OR写起来简单。
IN更常用在子查询中进行判断。这是OR代替不了的！

NOT IN可以判断值不在列表中。

查看职位是MANAGER或CLERK的员工信息：
SELECT
  ename,job
FROM
  emp_csy
WHERE
  job IN('MANAGER','CLERK');