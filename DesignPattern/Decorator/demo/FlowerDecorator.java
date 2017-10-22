package decorator.demo;

/**
 * 给蛋糕添加的花
 * @author Nicholas
 *
 */
public class FlowerDecorator extends OtherDecorator{
	
	/**
	 * 构造函数
	 * 传入一个cake实例，也就是前面所实现的Cake的子类，如奶酪蛋糕，巧克力蛋糕等等。
	 * @param cake
	 */
	public FlowerDecorator(Cake cake){
		super(cake);//调用父类的构造方法，可以获取Cake的实例了。就可以调用Cake实例的方法.
		super.remark="一朵玫瑰花";
	}
	
	/**
	 * 实现了装饰器抽象类的getImpression方法。
	 */
	public String getImpression() {
		//这是重点。我们通过构造方法传入的cake实例。对cake进行了装饰，增加了新的功能。
		return cake.getImpression()+","+"看到一朵花真是happy";
	}

	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}
}
