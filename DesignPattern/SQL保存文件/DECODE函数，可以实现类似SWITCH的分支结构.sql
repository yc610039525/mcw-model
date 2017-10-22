DECODE函数

DECODE函数，可以实现类似SWITCH的分支结构。
若第一个参数的值等于第二个参数的值，函数返回第三个参数的值，
否则若等于第四个参数的值，就返回第五个参数的值，以此类推。
最后可以单独定义一个参数作为DEFAULT，指的是若
前面都不满足，函数返回该值，若没有定义DEFAULT，函数返回NULL。

SELECT
  ename,job,sal,
  DECODE(job,'MANAGER',sal*1.2,
        'ANALYST',sal*1.1,
        'SALESMAN',sal*1.05,
        sal) salary
FROM emp_csy

计算职位的人数，
analyst/manager属于vip,
其余是普通员工operation

DECODE函数也可以应用在GROUP BY中，意义在于，可以将
字段中不同的值看做一组，做法是：将需要看做一组的那几个值
使用DECODE都改为同一个值即可。

下面的例子中，我们将ANALYSY和MANAGER这两个值都改为了VIP，
于是他们就被看做一组了：
SELECT DECODE(
            job,
            'ANALYST','VIP',
            'MANAGER','VIP',
            'OPERATION') job,COUNT(*)
FROM emp_csy
GROUP BY DECODE(
            job,
            'ANALYST','VIP',
            'MANAGER','VIP',
            'OPERATION') job,COUNT(*)
FROM emp_csy


SELECT deptno,dname,loc
FROM dept_csy
ORDER BY
    DECODE(
      dname,
      'OPERATIONS',1,
      'ACCOUNTING',2,
      'SALES',3);

            