package decorator.demo;

/**
 * ±ùä¿ÁÜµ°¸â
 * @author Nicholas
 *
 */
public class IceCake extends Cake{
	public IceCake(){
		super.remark="±ùä¿ÁÜµ°¸â";
	}


	public String getImpression() {
		return "±ùË¬ÎŞ±È";
	}
	
	
}
