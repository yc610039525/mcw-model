package decorator.demo;
/**
 * ���ҵ���
 * @author Nicholas
 *
 */
public class CheeseCake extends Cake{
	/**
	 * ���ҵ���Ĺ��췽��
	 */
	public CheeseCake(){
		super.remark="���ҵ���";//�޸����ҵ����������
	}

	/**
	 * ʵ����Cake�������getImpression
	 * �����ҵ���ĸо�����
	 */
	public String getImpression() {
		return "�������";
	}

}
