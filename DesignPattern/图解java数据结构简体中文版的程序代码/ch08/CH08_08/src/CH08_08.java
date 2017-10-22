// =============== Program Description ===============
// 程序名称： CH08_08.java                               
// 程序目的：基数排序法
//	基数排序法由小到大排序
// ===================================================

import java.io.*;
import java.util.*;

public class CH08_08 extends Object
{
	int size;
	int data[]=new int[100];
	
	public static void main(String args[])
	{
		CH08_08 test = new CH08_08();
		
		System.out.print("请输入数组大小(100以下)：");
		try{			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			test.size=Integer.parseInt(br.readLine());
		}catch(Exception e){}
		
		test.inputarr ();
		System.out.print("您输入的原始数据是：\n");
		test.showdata ();
		
		test.radix ();
	}
	
	void inputarr()
	{
		Random rand=new Random();
		int i;
		for (i=0;i<size;i++)
			data[i]=(Math.abs(rand.nextInt(999)))+1; //设定data值最大为3位数
	}
	
	void showdata()
	{  
		int i;
		for (i=0;i<size;i++)
			System.out.print(data[i]+" ");
		System.out.print("\n");
	}
	
	void radix()
	{  
		int i,j,k,n,m;
		for (n=1;n<=100;n=n*10)		//n为基数，由个位数开始排序
		{
			//设定暂存数组，[0~9位数][数据个数]，所有内容均为0
			int tmp[][]=new int[10][100];	
			for (i=0;i<size;i++)		//比较所有数据
			{				
				m=(data[i]/n)%10;  //m为n位数的值，如36取十位数(36/10)%10=3 
				tmp[m][i]=data[i]; //把data[i]的值暂存在tmp里
			}
	
			k=0;
			for (i=0;i<10;i++)
			{  
				for(j=0;j<size;j++)
				{					
					if(tmp[i][j] != 0) //因一开始设定tmp={0}，故不为0者即为
					{
						//data暂存在tmp 里的值，把tmp里的值放回data[ ]里
						data[k]=tmp[i][j];
						k++;
					}
				}
			}
			System.out.print("经过"+n+"位数排序后：");
			showdata();
		}
  	}
}
