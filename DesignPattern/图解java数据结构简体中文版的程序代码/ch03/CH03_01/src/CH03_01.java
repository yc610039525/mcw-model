// =============== Program Description ===============
// 程序名称： CH03_01.java                               
// 程序目的：建立5个学生成绩的单向链表，
//            并访问每一个节点来打印成绩
// ===================================================

import java.io.*;

public class CH03_01 
{
   public static void main(String args[]) throws IOException
   {
	   BufferedReader buf;
	   buf=new BufferedReader(new InputStreamReader(System.in));
	   int num;
	   String name;
	   int score;
	
	   System.out.println("请输入5个学生数据： ");
	   LinkedList list=new LinkedList();
	   for (int i=1;i<6;i++)
	   {
		   System.out.print("请输入座号： ");
		   num=Integer.parseInt(buf.readLine());
		   System.out.print("请输入姓名： ");
		   name=buf.readLine();
		   System.out.print("请输入成绩： ");
		   score=Integer.parseInt(buf.readLine());
		   list.insert(num,name,score);
		   System.out.println("-------------");
	   }
	   System.out.println(" 学生成绩  ");
	   System.out.println(" 学号姓名成绩 ===========");
	   list.print();
    }
}
