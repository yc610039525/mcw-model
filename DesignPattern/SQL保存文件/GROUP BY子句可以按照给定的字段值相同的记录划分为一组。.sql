
GROUP BY�Ӿ�
GROUP BY�Ӿ���԰��ո������ֶ�ֵ��ͬ�ļ�¼����Ϊһ�顣
Ȼ��ʹ�þۺϺ�������ͳ�ƽ����
��ʹ��GROUP BY�Ӿ䣬��ô���ű����м�¼����һ�顣

�鿴ÿ�����ŵ�����ʣ���С���ʵȣ�
SELECT
  deptno,MAX(sal),MIN(sal),SUM(sal),AVG(sal)
FROM emp_csy
GROUP BY deptno

GROUP BY�Ӿ�Ҳ���԰��ն��н��з��飬��ô�����⼸�е�
ֵ����ͬ�Ŀ���һ�顣

�鿴ͬ����ְͬλ��Ա��������ʣ���С���ʵȣ�
SELECT
  deptno,job,MAX(sal),MIN(sal),SUM(sal),AVG(sal)
FROM emp_csy
GROUP BY deptno,job

��SELECT�Ӿ��У������麯������ô�����麯���е������ֶ�
���������GROUP BY�Ӿ��С����Ƿ�����û��Ҫ��


�鿴�ĸ����ŵ����нˮ����4000���г��ò��ű�ţ������нˮ��
SELECT
  deptno,MAX(sal)
FROM emp_csy
WHERE sal>4000
GROUP BY deptno

�鿴�ĸ����ŵ�ƽ�����ʸ���2200���г��ò��ű����ƽ������
SELECT
  deptno,AVG(sal)
FROM emp_csy
GROUP BY deptno
HAVING AVG(sal)>2200