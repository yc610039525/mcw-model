ROWNUM
α�У����ֶο��Գ�����SELECT����У���������ʵ�����ڱ�
�е��ֶΡ���������SELECT�в�ѯ���ֶΣ�ʵ����ORACLE��
������ÿ��ѯһ�����ݣ��ͽ��к���Ϊ���ֶε�ֵ����1��ʼ��

SELECT ROWNUM,ename,sal,deptno
FROM emp_csy

�鿴��6���Ժ������
��Ҫע�⣺ROWNUMֻ����SELECT�����ÿ����ѯ��һ������
        ��Ż����������ԣ�������Ҫʹ��ROWNUM�� >1��
        �жϡ�
SELECT ROWNUM,ename,sal,deptno
FROM emp_csy
WHERE ROWNUM <>6

�ȱ�ź������Ż���ң�������Ҫ��
SELECT *
FROM(SELECT ROWNUM rn,ename,sal,deptno
    FROM emp_csy) t
WHERE t.rn>=6
ORDER BY sal

���ڷ�ҳ�Ļ����ϣ����������Ҫ����ô�����ڷ�ҳ��ѯ��
��Ҫ���β�ѯ����ɡ�
1��ȷ��ʵ�����ݵ�ͬʱ����
2�����
3�����ݱ��ȡ��Χ

�г����չ�����������󣬵�6��-��10����Ա����Ϣ

SELECT *
FROM (SELECT ROWNUM rn,t.*
      FROM (SELECT ename,sal,deptno
            FROM emp_csy
            ORDER BY sal) t)
WHERE rn BETWEEN 6 AND 10

һҳ��ʾ5������ʾ��3ҳ��
pageSize:ÿҳ��ʾ����Ŀ��
page    :ҳ��

start:(page-1)*pageSize+1
end:pageSiz*page