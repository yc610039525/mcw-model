ALL��ANY
ANY��ALL�����ڱȽ�>,>=,<,<=һ���б��е�ֵ
>ANY:�����б�����С�ļ���
>ALL:�����б�������
<ANY:С���б������ļ���
<ALL:С���б�����С��
ͨ��ʹ��ANY����ALL���б��в�����̶�ֵ����������
�Ӳ�ѯ�С�

SELECT
 empno,ename,job,sal,deptno
FROM emp_csy
WHWRE
  sal>ALL(3000,4000,5000);