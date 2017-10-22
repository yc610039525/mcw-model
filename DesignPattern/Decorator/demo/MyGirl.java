package decorator.demo;

public class MyGirl {
	public static void main(String[] args){
		Cake cheeseCake = new NutsDecorator(new FlowerDecorator(new CheeseCake()));
		System.out.println("remark "+cheeseCake.getRemark());
		System.out.println("impression "+cheeseCake.getImpression());
	}
}
