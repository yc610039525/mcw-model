// =============== Program Description ===============
// 程序名称： CH01_02.java                               
// 程序目的：类继承
// ===================================================
	
//基类
class BMW_Serial
{ //成员数据
  private int carLength, engCC, maxSpeed;
  public String modelName;
  //类方法
  public void ShowData()
  {
	carLength = 423;
	engCC = 3000;
	maxSpeed = 250;
	System.out.println(modelName + "基本数据");
	System.out.println("车身长度：" + carLength);
	System.out.println("汽缸CC数：" + engCC);
	System.out.println("最高车速：" + maxSpeed);
  }
}
//派生类
public class CH01_02 extends BMW_Serial
{ //构造函数
  public CH01_02(String name)
  {
	modelName = name;
  }
  //主程序区块
  public static void main(String args[])
  {
	//实现对象
	  CH01_02 BMW318= new CH01_02("BMW 318i");
	  BMW318.ShowData();
  }
 }