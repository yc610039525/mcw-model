package decorator.demo;

public class CardDecorator extends OtherDecorator {

	public CardDecorator(Cake cake) {
		super(cake);
		super.remark = "�ؿ�";
	}


	public String getImpression() {
		return cake.getImpression()+","+"�������ڸв�������";
	}
	
	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}

}
