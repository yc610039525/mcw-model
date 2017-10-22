// =============== Program Description ===============
// 程序名称： CH01_05.java                               
// 程序目的：接口操作
// ===================================================

//声明接口一
interface autoMobile_setData
{ //成员方法
  void setData();
}
//声明接口二
interface autoMobile_showData
{ 	//成员方法
	void showData();
}
//接口实现类
class CH01_05 implements autoMobile_setData, autoMobile_showData
{ 	//成员数据
	int carLength, engCC, maxSpeed;
	//构造函数
	public CH01_05(String modelName)
	{
		System.out.println("BENZ系列："+ modelName +"基本数据");
	}
	//重新定义抽象方法
	public void setData()
	{
		carLength = 400;
		engCC = 3200;
		maxSpeed = 280;
	}
	public void showData()
	{
		System.out.println("车身长度：" + carLength);
		System.out.println("汽缸CC数：" + engCC);
		System.out.println("最高车速：" + maxSpeed);
	  }
	//主程序区块
	public static void main(String args[])
	{ 
		CH01_05 SLK2000 = new CH01_05("SLK2000");
		SLK2000.setData();
		SLK2000.showData();
	}
}
