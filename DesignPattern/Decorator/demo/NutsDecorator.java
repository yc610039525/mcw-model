package decorator.demo;

/**
 * ��������ӵļ��
 * @author Nicholas
 *
 */
public class NutsDecorator extends OtherDecorator{

	public NutsDecorator(Cake cake){
		super(cake);
		super.remark = "����";
	}
	
	public String getImpression() {
		return cake.getImpression()+","+"�������ڸв�������";
	}
	
	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}
}
