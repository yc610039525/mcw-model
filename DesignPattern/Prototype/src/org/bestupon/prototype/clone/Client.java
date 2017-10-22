package org.bestupon.prototype.clone;

public class Client {
	public static void main(String args []) throws CloneNotSupportedException {
		DogClone dogClone = new DogClone();
		dogClone.legCounts = 3;
		System.out.println("原来的克隆狗腿数量："+dogClone.legCounts);
		System.out.println("原来的普通狗腿的数量："+dogClone.dog);//Dog的toString方法返回的值。
		
		DogClone dogClone1 = (DogClone)dogClone.clone();
		dogClone1.legCounts=2 ;
		
		 Dog dog = dogClone1.dog;
		 dog.changeLegCounts();
		 System.out.println("克隆后原来狗腿数量："+dogClone.legCounts);
		 /**
		  * 出现的结果是：8
		  * 原因很简单就是dog是一个引用，改变一个对象的话，会改变另一个对象。
		  */
		 System.out.println("克隆后原来普通狗的数量："+ dogClone.dog);
		 System.out.println("克隆后克隆狗腿的数量："+ dogClone1.legCounts);
		 /**
		  *改变源：改变了自身dogClone.dog，影像了对象dogClone.dog 的值，
		  */
		 System.out.println("克隆后普通狗的数量："+ dogClone1.dog);
		
	}
}
