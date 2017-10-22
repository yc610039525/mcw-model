// =============== Program Description ===============
// 程序名称： CH03_02.java                               
// 程序目的：利用链表来建立、删除和打印学生成绩
// ===================================================

import java.util.*;
import java.io.*;
public class CH03_02 
{
   public static void main(String args[]) throws IOException
   {
	   BufferedReader buf;
	   Random rand=new Random();
	   buf=new BufferedReader(new InputStreamReader(System.in));
	   StuLinkedList list =new StuLinkedList();
	   int i,j,findword=0,data[][]=new int[12][10];
	   String name[]=new String[] {"Allen","Scott","Marry","Jon","Mark","Ricky","Lisa","Jasica","Hanson","Amy","Bob","Jack"};
	   System.out.println("学号成绩学号成绩学号成绩学号成绩\n ");
	   for (i=0;i<12;i++)
	   {
		   data[i][0]=i+1;
		   data[i][1]=(Math.abs(rand.nextInt(50)))+50;
		   list.insert(data[i][0],name[i],data[i][1]);
	   }
	   for (i=0;i<3;i++)
	   {
		   for(j=0;j<4;j++)
			   System.out.print("["+data[j*3+i][0]+"]  ["+data[j*3+i][1]+"]  ");
		   System.out.println();
	   }

	   while(true)
	   {
		   System.out.print("输入要删除成绩的学号，结束输入-1： ");
		   findword=Integer.parseInt(buf.readLine());
		   if(findword==-1)
			   break;
		   else
		   {
			   Node current=new Node(list.first.data,list.first.names,list.first.np);
			   current.next=list.first.next;
			   while(current.data!=findword) current=current.next;
			   list.delete(current);
		   }
		   System.out.println("删除后成绩列表，请注意！要删除的成绩其学号必须在此列表中\n");
		   list.print();
	   }
    }
}
