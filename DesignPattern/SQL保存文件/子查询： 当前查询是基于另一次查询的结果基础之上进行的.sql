�Ӳ�ѯ��
��ǰ��ѯ�ǻ�����һ�β�ѯ�Ľ������֮�Ͻ��еġ���ôǰ��
ִ�е��Ǵβ�ѯ��Ϊ�Ӳ�ѯ������Ƕ����ʵ�ʲ�ѯ�еġ�

�鿴��SCOTT��ͬ���ŵ�Ա����
1���鿴SCOTT�Ĳ������ĸ���
2������SCOTT�Ĳ��ű����Ϊ��������ѯ������ͬ��Ա����Ϣ

SELECT deptno
FROM emp_csy
WHERE ename='SCOTT'

SELECT ename,job,sal,deptno
FROM emp_csy
WHERE deptno=(SELECT deptno
              FROM emp_csy
              WHERE ename='SCOTT')
AND ename<>'SCOTT'