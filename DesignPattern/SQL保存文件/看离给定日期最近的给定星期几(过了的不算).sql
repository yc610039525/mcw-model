SELECT ename,
  ADD_MONTHS(hiredate,20*12)
FROM emp_csy;

�鿴ÿ���˵�ĿǰΪֹ�����˶��ٸ��£�
SELECT ename,
  MONTHS_BETWEEN(sysdate,hiredate)
FROM emp_csy;


���������������ĸ������ڼ�(���˵Ĳ���)
�ڶ��������������ַ��������ǲ��Ƽ�����Ϊ����������
�ڶ�������Ҳ���������֣��Ƽ�ʹ�����֣�������Ҫע�����
1��ʾ�����գ�2��ʾ����һ���Դ����ơ�
�ú�������������������������...
SELECT 
  NEXT_DAY(sysdate,7)
FROM DUAL;