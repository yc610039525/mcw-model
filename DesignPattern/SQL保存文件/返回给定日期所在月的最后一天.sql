LAST_DAY(date)���ظ������������µ����һ�졣����ֵ��Ȼ
��һ��DATE����

�鿴�����µ�����
SELECT
  LAST_DAY(sysdate)
FROM DUAL

�鿴ÿ��Ա����ְ���µ��µ�
SELECT
  ename,LAST_DAY(hiredate+100)
FROM emp_csy

����Ҳ���Լ�һ�����֣������ֱ�ʾ����


�鿴2007��2�µ��µ������죿
SELECT
  LAST_DAY(TO_DATE('2007-02-01','YYYY-MM-DD'))
FROM DUAL