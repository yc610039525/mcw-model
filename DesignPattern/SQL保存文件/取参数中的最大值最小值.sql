SELECT
  LEAST(sysdate,'10-10��-08')
FROM DUAL;

LEAST(expr1,expr2,...)
��ȡ�����е���Сֵ

GREATEST(expr1,expr2,...)
��ȡ�����е����ֵ

�鿴ÿ��Ա������ְʱ�䣬����82���Ժ���ְ�ģ�����ʾ��
��ְʱ�䣬����82����ǰ��ְ�ģ�����ʾΪ82��1��1��

SELECT 
  ename,GREATEST(hiredate,TO_DATE('1982-01-01','YYYY-MM-DD'))
FROM emp_csy