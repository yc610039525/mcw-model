SELECT�Ӿ���Ҳ����ʹ���Ӳ�ѯ��
���Ӳ�ѯ����SELECT�Ӿ䲿�֣�������Ϊ�������ӵ���
һ�ֱ�����ʽ��ʹ�ø����

SELECT e.ename,e.sal,
      (SELECT d.dname FROM dept_csy d
      WHERE d.deptno = 50) dname
FROM emp_csy e;