�Ӳ�ѯ��FROM����
������ʹ��

�鿴�ȱ�����ƽ��нˮ�ߵ�Ա����

1:ÿ�����ŵ�ƽ��нˮ��
SELECT deptno,AVG(sal) avg_sal
FROM emp_csy
GROUP BY deptno

2:��ʵ�ʲ�ѯ
SELECT e.ename,e.sal,e.deptno
FROM emp_csy e,(SELECT deptno,AVG(sal) avg_sal
                FROM emp_csy
                GROUP BY deptno) t
WHERE e.deptno=t.deptno
AND e.sal>t.avg_sal

���ж����Ӳ�ѯͨ����FROM�Ӿ��б�����һ��������Ϊ���
��ѯ�ṩ����ʹ�á�
��FROM��ֱ��ʹ���Ӳ�ѯ��Ϊһ�ű�����һ�����������ͼ��

