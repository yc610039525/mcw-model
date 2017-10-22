package com.team.cd.pattern.singleton;
/**
 * 饿汉式
 * 常见一个对象需要消耗过多的资源 IO 数据库访问
 * @author: CaoYeung
 * @time: 下午5:11:27
 */
public class HungrySingleton {
	 private static HungrySingleton instance;
	    
	    static {
	        instance = new HungrySingleton();//或使用静态常量  类加载机制
	    }
	    
	    private HungrySingleton() {}
	    
	    public static HungrySingleton getInstance() {
	        return instance;
	    }
	    
}
