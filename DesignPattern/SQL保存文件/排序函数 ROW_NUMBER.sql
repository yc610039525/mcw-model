������ ROW_NUMBER

����ָ�����ֶη��飬������ָ�����ֶ����������һ������
������Ψһ�����֣�
���ղ��ŷ��飬���չ��ʽ�������������������������Ψһ������

SELECT
  ename,sal,deptno,
  ROW_NUMBER()
  OVER (PARTITION��BY deptno ORDER BY sal) rank
FROM emp_csy