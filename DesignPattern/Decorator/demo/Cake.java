package decorator.demo;

/**
 * 蛋糕基类
 * @author Nicholas
 *
 */
public abstract class Cake {
	String remark = "蛋糕";
	public String getRemark() {
		return remark;
	}
	public abstract String getImpression();//用来描述吃蛋糕的感觉。。。。
}
