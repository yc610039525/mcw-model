package decorator.demo;
/**
 * 乳酪蛋糕
 * @author Nicholas
 *
 */
public class CheeseCake extends Cake{
	/**
	 * 乳酪蛋糕的构造方法
	 */
	public CheeseCake(){
		super.remark="乳酪蛋糕";//修改乳酪蛋糕的描述。
	}

	/**
	 * 实现了Cake抽象类的getImpression
	 * 吃乳酪蛋糕的感觉。。
	 */
	public String getImpression() {
		return "香甜感受";
	}

}
