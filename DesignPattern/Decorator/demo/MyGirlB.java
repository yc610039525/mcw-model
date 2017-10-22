package decorator.demo;

public class MyGirlB {
	public static void main(String[] args){
		//用果仁，花包装巧克力蛋糕。
		Cake nutsFlowerChocolateCake = new NutsDecorator(new FlowerDecorator(new ChocolateCake()));
		System.out.println("remark "+nutsFlowerChocolateCake.getRemark());
		//吃蛋糕的感受已经发生了改变。
		System.out.println("impression "+nutsFlowerChocolateCake.getImpression());
	}
}
