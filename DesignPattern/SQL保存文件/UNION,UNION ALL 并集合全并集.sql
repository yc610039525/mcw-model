UNION,UNION ALL
������ȫ����
���ϲ���Ҫ������SELECT����ѯ���ֶ�Ҫ��ȫһ����

�ϲ�ְλ��'MANAGER' ��Ա����нˮ����2500��Ա��
���ϣ��鿴���ַ�ʽ�Ľ�����
SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
UNION
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;

SELECT ename,job,sal FROM emp_csy
WHERE job='MANAGER'
UNION ALL
SELECT ename,job,sal FROM emp_csy
WHERE sal>2500;