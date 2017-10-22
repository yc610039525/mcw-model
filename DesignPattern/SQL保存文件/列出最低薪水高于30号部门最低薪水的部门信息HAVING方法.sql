列出最低薪水高于30号部门最低薪水的部门信息？
HAVING方法：
SELECT deptno,MIN(sal)
FROM emp_csy
GROUP BY deptno
HAVING MIN(sal)>950 

SELECT MIN(sal)
FROM emp_csy
WHERE deptno = 30

SELECT deptno,AVG(sal)
FROM emp_csy
GROUP BY deptno
HAVING MIN(sal)>(SELECT MIN(sal)
                  FROM emp_csy
                  WHERE deptno=30)