package com.yangguangfu.proxy;
public class XiMenQiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WangPo wangPo;
		//��B�г���
		 wangPo = new WangPo();
		//Ȼ��˧��G˵����Ҫ����ŮA����
		wangPo.makeEyesWithMan();
		//������B����������ʵ����ŮA
		wangPo.happyWithMan();
		//˧��G����C
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi);
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}


