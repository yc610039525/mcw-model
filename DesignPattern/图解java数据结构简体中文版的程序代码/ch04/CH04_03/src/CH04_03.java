// =============== Program Description ===============
// 程序名称： CH04_03.java                               
// 程序目的：链表制作堆栈
// ===================================================

import java.io.*;

class Node //链接节点的声明
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class StackByLink 
{
	public Node front; //指向堆栈底端的指针
	public Node rear;  //指向堆栈顶端的指针
   //类方法：isEmpty()
   //判断堆栈如果为空堆栈,则front==null;
	public boolean isEmpty()
	{
		return front==null;
	}
   //类方法：output_of_Stack()
   //打印堆栈内容
	public void output_of_Stack()
	{
		Node current=front;
		while(current!=null)
		{
		System.out.print("["+current.data+"]");
		current=current.next;
		}
		System.out.println();
	}
   //类方法：output_of_Stack()
   //在堆栈顶端加入数据
	public void insert(int data)
	{
		Node newNode=new Node(data);
		if(this.isEmpty())
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
   //类方法：output_of_Stack()
   //在堆栈顶端删除数据
	public void pop()
	{
		Node newNode;
		if(this.isEmpty())
		{
			System.out.print("===目前为空堆栈===\n");
			return;
		}
		newNode=front;
		if(newNode==rear) 
			{
			front=null;
			rear=null;
			System.out.print("===目前为空堆栈===\n");
			}
		else
		{
			while(newNode.next!=rear) 
				newNode=newNode.next;
			newNode.next=rear.next;
			rear=newNode;
		}

	}
}

class CH04_03
{
   public static void main(String args[]) throws IOException
   {
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_linkedlist =new StackByLink();
		int choice=0;
                while(true)
		{
			System.out.print("(0)结束(1)在堆栈中加入数据(2)弹出堆栈数据:");
			choice=Integer.parseInt(buf.readLine());		
			if(choice==2)
			{
				stack_by_linkedlist.pop();
				System.out.println("数据弹出后的堆栈内容:");
				stack_by_linkedlist.output_of_Stack();
			}
			else if(choice==1)
			{
				System.out.print("请输入要加入堆栈的数据:");
				choice=Integer.parseInt(buf.readLine());
				stack_by_linkedlist.insert(choice);
				System.out.println("数据加入后的堆栈内容:");
				stack_by_linkedlist.output_of_Stack();
			}
			else if(choice==0)
				break;
			else
			{
				System.out.println("输入错误!!");
			}
		}
	}
}