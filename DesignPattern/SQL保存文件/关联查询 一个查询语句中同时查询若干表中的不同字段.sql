������ѯ
һ����ѯ�����ͬʱ��ѯ���ɱ��еĲ�ͬ�ֶ�

Ӧ��ע�⣬N�ű������ѯ����Ӧ����N-1������������

��������������������ݿ�Ὣ���ű��еļ�¼��һ���ӡ�����
�������������Ч��������������˷ѣ�����ʱ���ܵ���ϵͳ̱����
�������������ӳ����Ľ������Ϊ���ѿ�������

�鿴ÿ��Ա�������֣����ʣ����ű�ţ��Լ���������
SELECT
  e.ename,e.sal,e.deptno,d.dname
FROM emp_csy e,dept_csy d
WHERE e.deptno=d.deptno

��ѯSALES���ŵ�Ա������˭��
SELECT
  e.ename,e.deptno,d.dname
FROM emp_csy e,dept_csy d
WHERE e.deptno=d.deptno AND d.dname='SALES'

�����ӣ�Ҳ����Ϊ��������
������ʹ��JOIN�������ű����ҽ���������������ON�Ӿ���

�鿴ÿ��Ա������Ϣ����������
SELECT
  e.ename,d.dname
FROM
  emp_csy e JOIN dept_csy d
ON
  e.deptno=d.deptno
ORDER BY d.dname
WHERE
  d.deptno='SALES'

��ѯ���֣�emp����û�г���KING��dept���в�������Ϊ
OPERATIONS�ļ�¼Ҳû�г��ֹ���
ԭ�����ڣ����ǽ��й�����ѯʱ�����Ƕ�����������������
  
JOIN�Ὣ������������������ON�Ӿ��ϣ���ôWHERE�Ϳ���
ֻ�������������ʹ�ö�������ѯʱ�ɶ��Ը��ߡ�

��������Ҫ�ڹ�����ѯʱ��ע����ʾһ�ű��е���������ʱ�������������������������ݣ���
���ǿ���ʹ���������������
��ô���������������ļ�¼�У������������ж�Ӧ���ֶο���
��ʾ����ô��Ӧ�����ӱ������ڲ����������������ñ��е��ֶ�
ֵȫ��ΪNULL��

SELECT
  e.ename,e.sal,d.dname,d.loc
FROM
  emp_csy e FULL OUTER JOIN dept_csy d
ON
  e.deptno=d.deptno()
  


SELECT
  e.ename,e.sal,d.dname,d.loc
FROM
  emp_csy e,dept_csy d
WHERE
  e.deptno=d.deptno(+)
  
  
SELECT
  e.ename"Ա��",m.ename"�쵼"
FROM
  emp_csy e,emp_csy m
WHERE
  e.mgr=m.empno
