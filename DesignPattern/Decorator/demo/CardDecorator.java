package decorator.demo;

public class CardDecorator extends OtherDecorator {

	public CardDecorator(Cake cake) {
		super(cake);
		super.remark = "贺卡";
	}


	public String getImpression() {
		return cake.getImpression()+","+"吃起来口感不错啊！！";
	}
	
	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}

}
