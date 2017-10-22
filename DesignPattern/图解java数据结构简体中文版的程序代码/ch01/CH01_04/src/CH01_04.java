// =============== Program Description ===============
// 程序名称： CH01_04.java                               
// 程序目的：抽象类
// ===================================================

//抽象类
abstract class autoMobile
{ 	//抽象方法
	abstract public void setData();
	abstract public void showData();
}
//派生类
class BENZ_Serial extends autoMobile
{ 	//成员数据
	private int carLength, engCC, maxSpeed;
	//构造函数
	public BENZ_Serial(String modelName)
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
}
//主要类
public class CH01_04
{
  public static void main(String args[])
  {   //实现抽象类对象
	  	autoMobile myCar = null;
	  //实现派生类对象
	  	BENZ_Serial SLK2000 = new BENZ_Serial("SLK2000");
	  //实现多态
		myCar = SLK2000;
		myCar.setData();
		myCar.showData();
  }
}

