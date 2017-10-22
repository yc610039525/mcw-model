// =============== Program Description ===============
// 程序名称： CH01_03.java                               
// 程序目的：对象多态
// ===================================================

//基类
class myComputer
{ 	//类方法
	public void Run(){};
}
//派生类一
class myScanner extends myComputer
{ 	//成员数据
	private String paperScan;
	//构造函数
	public myScanner(String inData){this.paperScan = new String(inData);}
	//重新定义类方法
	public void Run(){System.out.println("使用扫描仪扫描" + paperScan + "完成");}
}
//派生类二
class myPrinter extends myComputer
{ 	//成员数据
	private String paperPrint;
	//构造函数
	public myPrinter(String inData){this.paperPrint = new String(inData);}
	//重新定义类方法
	public void Run(){System.out.println("使用打印机打印" + paperPrint + "完成");}
}
//主要类
public class CH01_03
{ 	//成员数据
	private String inputData;
	//构造函数
	public CH01_03()
	{
		System.out.println("用户想要先扫描文件A!!再将文件A打印!!");
		System.out.println("它的流程为：");
		inputData = "文件A";
	}    
	public static void main(String args[])
	{ 	//实现对象
		CH01_03 computerUser = new CH01_03();
		myComputer MyComputer;
		myScanner MyScanner = new myScanner("对象A");
		myPrinter MyPrinter = new myPrinter("对象A");
		System.out.println("将对象“计算机”转变成对象“扫描仪”执行Run()方法!!");
		//实现多态
		MyComputer = MyScanner;
		MyComputer.Run();   
		System.out.println("将对象“计算机”转变成对象“打印机”执行Run()方法!!");
		//实现多态
		MyComputer = MyPrinter;
		MyComputer.Run();
	}
}
