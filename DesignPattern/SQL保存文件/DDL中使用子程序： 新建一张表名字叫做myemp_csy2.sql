DDL��ʹ���ӳ���
�½�һ�ű����ֽ���myemp_csy2
�ñ��ֶΣ�
  empno,ename,sal,deptno
������emp���� 10,20�Ų��ŵ�����Ա����Ϣ

CREATE TABLE myemp_csy2
AS
SELECT empno eno,ename,sal,deptno
FROM emp_csy
WHERE deptno IN (10,20)

ʹ���Ӳ�ѯ��������ô����ֶξ����ֲ�ѯ��SELECT��
�оٵ��ֶΣ��ֶ���һ�¡���ϣ���ֶ�����һ�£�������
SELECT������оٵ��ֶκ�����ӱ������������Ͳ���ı䡣
��ʹ���Ӳ�ѯ������󣬱����������ݵģ����ݾ��������Ӳ�ѯ
��ѯ���������н����

��ЩԱ���ȹ�˾��ƽ�����ʸ�
SELECT e.ename,e.sal
FROM emp_csy e
WHERE sal>(SELECT 
              AVG(sal)
              FROM emp_csy)

�鿴��SALESMAN��ͬ���ţ�������SALESMAN��Ա����Ϣ
�г�:���֣�нˮ��ְλ�����ű��
SELECT e.deptno
FROM emp_csy e
WHERE job = 'SALESMAN'

����ѯ���Ϊһ�����е���ʱ����ô���ж��Ƿ���ȾͲ���
ʹ��"="����Ϊֵ�кü���������ֻ��ѡ���������֮һ����ô
���ʱ���Ҫʹ�õ�IN

SELECT ename,sal,job,deptno
FROM emp_csy
WHERE deptno IN(SELECT deptno
                FROM emp_csy
                WHERE job='SALESMAN')
AND job <>'SALESMAN'

�г�������SALESMAN���ʶ��ߵ�Ա����Ϣ��
SELECT sal,job
FROM emp_csy
WHERE job='SALESMAN'

SELECT ename,job,sal
FROM emp_csy
WHERE sal >ALL (SELECT sal
                FROM emp_csy
                WHERE job = 'SALESMAN')

���Ӳ�ѯ�ǵ��е��еģ���ô��WHERE�п���ʹ�õıȽ�����
=,>,>=,<,<=,<>

���Ӳ�ѯ�Ƕ��ж��еģ�����ʹ�õģ�
IN,NOT IN,(>,>=,<,<=)ALL|ANY