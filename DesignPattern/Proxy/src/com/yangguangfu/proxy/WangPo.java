package com.yangguangfu.proxy;
public class WangPo implements KindWoman {
	
	private KindWoman kindWoman;
	
	public WangPo(){
		//Ĭ�ϵĻ�����ŮA�Ĵ���
		this.kindWoman = new PanJinLian();
	}
	//��������KindWomam���κ�һ��Ů�˵Ĵ���ֻҪ������һ����
	public WangPo(KindWoman kindWoman){
		this.kindWoman = kindWoman;
	}
	@Override
	public void happyWithMan() {
		//�Լ����ˣ��ɲ����ˣ������Խ�����Ĵ��档
		this.kindWoman.happyWithMan();
		
	}
	@Override
	public void makeEyesWithMan() {
		//B��ʹ��ˣ�˭���������۰�
		this.kindWoman.makeEyesWithMan();
		
	}
}
