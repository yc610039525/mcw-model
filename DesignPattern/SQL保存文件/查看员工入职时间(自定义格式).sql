SELECT
  ename,TO_CHAR(hiredate,'YYYY"年"MM"月"DD"日"')
FROM emp_csy

查看每个员工的入职时间，显示格式为：YYYY年MM月DD日