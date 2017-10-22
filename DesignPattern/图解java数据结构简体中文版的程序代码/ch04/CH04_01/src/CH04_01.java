// =============== Program Description ===============
// 程序名称： CH04_01.java                               
// 程序目的：用数组模拟堆栈
// ===================================================

import java.io.*;

class StackByArray { //以数组模拟堆栈的类声明
   private int[] stack; //在类中声明数组
   private int top;  //指向堆栈顶端的索引
   //StackByArray类构造函数
   public StackByArray(int stack_size) {
	      stack=new int[stack_size]; //建立数组
	      top=-1;
   }
      //类方法：push
   //存放顶端数据，并更正新堆栈的内容
	   public boolean push(int data) {
      if (top>=stack.length) { //判断堆栈顶端的索引是否大于数组大小
         System.out.println("堆栈已满，无法再加入");
         return false;
      }
      else {
         stack[++top]=data; //将数据存入堆栈
         return true;
      }
   }
   //类方法：empty
   //判断堆栈是否为空堆栈，是则返回true，不是则返回false
   public boolean empty() {
      if (top==-1) return true;
      else         return false;
   }
   //类方法：pop
   //从堆栈取出数据
   public int pop() {
      if(empty()) //判断堆栈是否为空，如果是则返回-1值
        return -1;
      else
        return stack[top--]; //先将数据取出后，再将堆栈指针往下移
   }
}
//主类的声明
public class CH04_01 {
   public static void main(String args[]) throws IOException {
      BufferedReader buf;
      int value;
      StackByArray stack =new StackByArray(10);
      buf=new BufferedReader(
                   new InputStreamReader(System.in));
      System.out.println("请依次输入10个数据：");
      for (int i=0;i<10;i++) {
         value=Integer.parseInt(buf.readLine());
         stack.push(value);
      }
      System.out.println("=============================");
      while (!stack.empty()) //将堆栈数据陆续从顶端弹出
         System.out.println("堆栈弹出的顺序为:"+stack.pop());
   }
}