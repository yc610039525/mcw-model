���麯�����ۺϺ��������к���
���ã���һ�����ݽ���ͳ�ƣ��ó�һ�������

MAX(),MIN()�����ֵ����Сֵ

�鿴��˾��߹�������͹��ʷֱ��Ƕ��٣�
SELECT
  MAX(sal),MIN(sal)
FROM emp_csy

SUM(),AVG()�ֱ�ͳ���ܺ���ƽ��ֵ

�鿴��˾Ա�������ܺͣ���ƽ�����ʣ�
SELECT
  SUM(sal),AVG(sal)
FROM emp_csy

�ڷ��麯���У�NULLֵ�Ǳ����Եġ�
SELECT
  SUM(comm),AVG(NVL(comm,0))
FROM emp_csy