package decorator.demo;

/**
 * 巧克力蛋糕
 * @author Nicholas
 *
 */
public class ChocolateCake extends Cake{
	public ChocolateCake(){
		super.remark="巧克力蛋糕";
	}


	public String getImpression() {
		return "丝一般的润滑";
	}
}
