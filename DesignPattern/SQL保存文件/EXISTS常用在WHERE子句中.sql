EXISTS������WHERE�Ӿ��У������ǣ�
EXISTS������Ӳ�ѯֻҪ�ܲ�ѯ������һ����¼����ôEXISTS
�ķ���ֵ��ΪTRUE

��ѯ��Ա���Ĳ��Ŷ�����Щ��
SELECT deptno,dname
FROM dept_csy d
WHERE EXISTS(SELECT*FROM emp_csy e
              WHERE d.deptno = e.deptno);
���Ӳ�ѯ���������ڣ���DEPT����ÿһ����¼��deptno��ֵ
��Ϊ����ȥemp���в�ѯ�Ƿ��м�¼����EXISTS������������