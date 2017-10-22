package com.yangguangfu.proxy;
public class XiMenQiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WangPo wangPo;
		//把B叫出来
		 wangPo = new WangPo();
		//然后帅哥G说，我要和美女A恋爱
		wangPo.makeEyesWithMan();
		//表面是B在恋爱，其实是美女A
		wangPo.happyWithMan();
		//帅哥G勾引C
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi);
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}


