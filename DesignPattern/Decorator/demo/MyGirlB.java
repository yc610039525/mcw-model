package decorator.demo;

public class MyGirlB {
	public static void main(String[] args){
		//�ù��ʣ�����װ�ɿ������⡣
		Cake nutsFlowerChocolateCake = new NutsDecorator(new FlowerDecorator(new ChocolateCake()));
		System.out.println("remark "+nutsFlowerChocolateCake.getRemark());
		//�Ե���ĸ����Ѿ������˸ı䡣
		System.out.println("impression "+nutsFlowerChocolateCake.getImpression());
	}
}
