package decorator.demo;

/**
 * ����ܵ���
 * @author Nicholas
 *
 */
public class IceCake extends Cake{
	public IceCake(){
		super.remark="����ܵ���";
	}


	public String getImpression() {
		return "��ˬ�ޱ�";
	}
	
	
}
