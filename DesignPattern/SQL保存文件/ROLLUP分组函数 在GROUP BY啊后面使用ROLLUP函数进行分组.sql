ROLLUP���麯��

�鿴ÿ���Ӫҵ�
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id,day_id
ORDER BY year_id,month_id,day_id

�鿴ÿ�µ�Ӫҵ�
�꣬�¶���ͬ�ļ�¼����һ�飬����Щ��¼��sales_value
�����ʾ���ɡ�
SELECT year_id,month_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id
ORDER BY year_id,month_id

�鿴ÿ���Ӫҵ�
SELECT year_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id
ORDER BY year_id

�鿴�ܹ���Ӫҵ�
SELECT SUM(sales_value)
FROM sales_csy000


����4��SQL�����ص��ǣ�GROUP BY�д�
year_id,month_id,day_id���з��飬��������٣�ֱ��һ����û�С�
����ϣ��������4��SQL���ĳ���������һ����Ϊһ��������ء�

ROLLUP���麯��
��GROUP BY������ʹ��ROLLUP�������з��飬�ﵽ��Ч�����ǣ�ROLLUP�е�
��������ݼ��ֱ���飬Ȼ������
�Ľ������һ����ʾ����������ĳ����Ч������4���ѯ��
���н����

SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_csy
GROUP BY year_id,month_id,day_id
ORDER BY year_id,month_id,day_id
