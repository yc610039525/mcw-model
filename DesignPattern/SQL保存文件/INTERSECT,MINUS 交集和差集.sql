INTERSECT,MINUS
�����Ͳ
���ϲ���Ҫ������SELECT����ѯ���ֶ�Ҫ��ȫһ����

SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
INTERSECT
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;


SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
MINUS
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;