AND��OR���������������ѯ����
AND������������Ϊtrueʱ����Ϊtrue
OR������������Ϊfalseʱ����Ϊfalse

��ѯнˮ����1000����ְλ��'CLERK' ��ְԱ��Ϣ
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1000 AND job='CLERK';

��ѯнˮ����1000��ְλ��'CLERK'��ְԱ��Ϣ
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1000 OR job='CLERK';

�鿴���ʸ���1250��CLERK��SALESMAN��
SELECT ename,sal,job
FROM emp_csy
WHERE sal>1250 AND (job='CLERK' OR job='SALESMAN');

AND�����ȼ�����OR
