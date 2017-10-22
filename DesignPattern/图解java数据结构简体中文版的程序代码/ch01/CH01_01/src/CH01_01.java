// =============== Program Description ===============
// 程序名称： CH01_01.java                               
// 程序目的：类别与对象
// ===================================================

//声明类
public class CH01_01
{ //成员数据
  private int carLength, engCC, maxSpeed;
  private String modelName;
  //建构函数
  public CH01_01(String name)
  {
	carLength = 423;
	engCC = 3000;
	maxSpeed = 250;
	modelName = name;
  }
  //类方法
  public void ShowData()
  {
	System.out.println(modelName + "基本数据");
	System.out.println("车身长度：" + carLength);
	System.out.println("汽缸CC数：" + engCC);
	System.out.println("最高车速：" + maxSpeed);
  }
  public void SetSpeed(int setSpeed)
  {
System.out.println("\n使用定速器");
maxSpeed = setSpeed;
System.out.println("定速设定为：" + setSpeed);
System.out.println("目前最高车速为：" + maxSpeed);
  }
  //主程序
  public static void main(String args[])
  {
	//实现对象
	CH01_01 BMW318 = new CH01_01("BMW 318i");
	//调用类方法
	BMW318.ShowData();
	BMW318.SetSpeed(160);
  }
}
