�г����нˮ����30�Ų������нˮ�Ĳ�����Ϣ��
HAVING������
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