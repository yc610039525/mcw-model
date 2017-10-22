// =============== Program Description ===============
// 程序名称： CH02_01.java                               
// 程序目的：多维数组的应用
// ===================================================

import java.util.*;
public class CH02_01{
	public static void main(String[] args){
		//变量声明
		int intCreate=1000000;           //产生随机数次数
		int intRand;                    //产生的随机数号码
		int[][] intArray=new int[2][42];    //放置随机数数组
		
		//将产生的随机数存放至数组
		while(intCreate-->0){
			intRand=(int)(Math.random()*42);
			intArray[0][intRand]++;
			intArray[1][intRand]++;
		}
		
		//对intArray[0]数组做排序
		Arrays.sort(intArray[0]);
		
		//找出最大数六个数字号码
		for(int i=41;i>(41-6);i--){

			//逐一检查次数相同者
			for(int j=41;j>=0;j--){

				//当次数符合时打印
				if(intArray[0][i]==intArray[1][j]){
					System.out.println("随机数号码 "+(j+1)+" 出现 "+intArray[0][i]+" 次");
					intArray[1][j]=0;   //将找到的数值将次数归零
					break;              //中断内循环，继续外循环
				}	
			}
		}
	}
}

