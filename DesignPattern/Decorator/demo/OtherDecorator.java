package decorator.demo;

/**
 * 其他用来添加蛋糕的东西
 * @author Nicholas
 *
 */
public abstract class OtherDecorator extends Cake{
	Cake cake;
	/**
	 * 引用一个Cake.
	 * 让被装饰者进入装饰者之中。这里用的是构造方法注入。
	 * 这样就可以调用Cake实例的方法了。
	 * @param cake
	 */
	public OtherDecorator(Cake cake){
		this.cake=cake;
	}
	/**
	 * 让装饰器的子类都去实现getRemark方法。业务需要每个装饰器都要有描述。
	 */
	public abstract String getRemark();
}
