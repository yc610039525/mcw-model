package org.bestupon.prototype.clone;

public class Client {
	public static void main(String args []) throws CloneNotSupportedException {
		DogClone dogClone = new DogClone();
		dogClone.legCounts = 3;
		System.out.println("ԭ���Ŀ�¡����������"+dogClone.legCounts);
		System.out.println("ԭ������ͨ���ȵ�������"+dogClone.dog);//Dog��toString�������ص�ֵ��
		
		DogClone dogClone1 = (DogClone)dogClone.clone();
		dogClone1.legCounts=2 ;
		
		 Dog dog = dogClone1.dog;
		 dog.changeLegCounts();
		 System.out.println("��¡��ԭ������������"+dogClone.legCounts);
		 /**
		  * ���ֵĽ���ǣ�8
		  * ԭ��ܼ򵥾���dog��һ�����ã��ı�һ������Ļ�����ı���һ������
		  */
		 System.out.println("��¡��ԭ����ͨ����������"+ dogClone.dog);
		 System.out.println("��¡���¡���ȵ�������"+ dogClone1.legCounts);
		 /**
		  *�ı�Դ���ı�������dogClone.dog��Ӱ���˶���dogClone.dog ��ֵ��
		  */
		 System.out.println("��¡����ͨ����������"+ dogClone1.dog);
		
	}
}
