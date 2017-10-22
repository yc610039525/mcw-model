package decorator.demo;

/**
 * 给蛋糕添加的坚果
 * @author Nicholas
 *
 */
public class NutsDecorator extends OtherDecorator{

	public NutsDecorator(Cake cake){
		super(cake);
		super.remark = "果仁";
	}
	
	public String getImpression() {
		return cake.getImpression()+","+"吃起来口感不错啊！！";
	}
	
	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}
}
