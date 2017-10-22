和DECODE函数功能相似的有CASE语句，实现类似于if-else的操作。

SELECT ename,job,sal,
    CASE job WHEN'MANAGER' THEN sal*1.2
             WHEN'ANALYST'THEN sal*1.1
             WHEN'SALESMAN'THEN sal*1.05
             ELSE sal END
    bonus
FROM emp_csy;