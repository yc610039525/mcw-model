DECODE����

DECODE����������ʵ������SWITCH�ķ�֧�ṹ��
����һ��������ֵ���ڵڶ���������ֵ���������ص�����������ֵ��
���������ڵ��ĸ�������ֵ���ͷ��ص����������ֵ���Դ����ơ�
�����Ե�������һ��������ΪDEFAULT��ָ������
ǰ�涼�����㣬�������ظ�ֵ����û�ж���DEFAULT����������NULL��

SELECT
  ename,job,sal,
  DECODE(job,'MANAGER',sal*1.2,
        'ANALYST',sal*1.1,
        'SALESMAN',sal*1.05,
        sal) salary
FROM emp_csy

����ְλ��������
analyst/manager����vip,
��������ͨԱ��operation

DECODE����Ҳ����Ӧ����GROUP BY�У��������ڣ����Խ�
�ֶ��в�ͬ��ֵ����һ�飬�����ǣ�����Ҫ����һ����Ǽ���ֵ
ʹ��DECODE����Ϊͬһ��ֵ���ɡ�

����������У����ǽ�ANALYSY��MANAGER������ֵ����Ϊ��VIP��
�������Ǿͱ�����һ���ˣ�
SELECT DECODE(
            job,
            'ANALYST','VIP',
            'MANAGER','VIP',
            'OPERATION') job,COUNT(*)
FROM emp_csy
GROUP BY DECODE(
            job,
            'ANALYST','VIP',
            'MANAGER','VIP',
            'OPERATION') job,COUNT(*)
FROM emp_csy


SELECT deptno,dname,loc
FROM dept_csy
ORDER BY
    DECODE(
      dname,
      'OPERATIONS',1,
      'ACCOUNTING',2,
      'SALES',3);

            