package com.yangguangfu.strategy;

public class ZhaoYun {

	/**
	 * ���Ƴ����ˣ�����������������Ľ��������β����
	 */
	public static void main(String[] args) {
		Context context;
		
		//�յ������ʱ��𿪵�һ��
		System.out.println("----------�ոյ������ʱ��𿪵�һ��---------------");
		context = new Context(new BackDoor());
		context.operate();//��ִ��
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		//�������ֲ�˼��ʱ���𿪵ڶ���
		System.out.println("----------�����ֲ�˼�񣬲�ڶ�����---------------");
		context = new Context(new GivenGreenLight());
		context.operate();//��ִ��
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		//��Ȩ��С׷���ˣ�զ�죿�𿪵���������
		System.out.println("----------��Ȩ��С׷���ˣ�զ�죿�𿪵���������---------------");
		context = new Context(new BlackEnemy());
		context.operate();//��ִ��
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

}
