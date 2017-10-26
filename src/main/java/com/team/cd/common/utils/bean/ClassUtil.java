package com.team.cd.common.utils.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.team.cd.common.utils.date.DateUtil;

public class ClassUtil {
	private static Class<?>	String;
	/**
	 * 获取到的参数 返回值 是Class
	 * @param obj
	 */
	public static void printClassMethodMessage(Object obj){
		Class<? extends Object> c = obj.getClass();
		System.out.println("获取Name:"+c.getName());
		Method[] ms = c.getMethods();
		for(int i = 0; i < ms.length;i++){
			Class<?> returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
			System.out.print(ms[i].getName()+"(");
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class<?> class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	/**
	 * 获取属性字段
	 * @param obj
	 */
	public static void printFieldMessage(Object obj) {
		Class<? extends Object> c = obj.getClass();
		//Field[] fs = c.getFields();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			Class<?> fieldType = field.getType();
			String typeName = fieldType.getName();
			
			String fieldName = field.getName();
			System.out.println(typeName+" "+fieldName);
		}
	}
	//
	public static void printConMessage(Object obj){
		Class<? extends Object> c = obj.getClass();
		//Constructor[] cs = c.getConstructors();
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor<?> constructor : cs) {
			System.out.print(constructor.getName()+"(");
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class<?> class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	//根据属性名称获取属性值
		public static Object getValueByPropertyName(Object obj, String propertyName) {
			String getMethodName = "get"
					+ propertyName.substring(0, 1).toUpperCase()
					+ propertyName.substring(1);
			Class<? extends Object> c = obj.getClass();
			try {
				Method m= c.getMethod(getMethodName);
				Object value = m.invoke(obj);
				return value;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		public void test(){
			System.out.println("test......");
		}
		public static void main(String[] args) throws Exception {
			Class<Integer> intclas = Integer.class;
			Class<?> forName = Class.forName("com.team.cd.common.utils.bean.Boo");
			@SuppressWarnings("unchecked")
			Class<Boo> cls = (Class<Boo>) ClassUtil.getClass("com.team.cd.common.utils.bean.Boo");	
			
			Object object = ClassUtil.getObject(ClassUtil.getClass("com.team.cd.common.utils.bean.Boo"));
			
			Boo newInstance2 = cls.newInstance();
			ClassUtil.getConstructors(cls);
			Object newInstance = cls.newInstance();
			Constructor<?> constructor = cls.getConstructor(String.class,String.class);
			Boo boo = (Boo)constructor.newInstance("ASS","ASS");
			boo.sayBoo("K");
//			System.out.println(cls.isSynthetic());
//			Constructor<?>[] constructors = cls.getConstructors();
//			System.out.println("getDeclaredConstructors:"+cls.getDeclaredConstructors().length);
//			System.out.println("getDeclaredMethods:"+cls.getDeclaredMethods().length);
//			System.out.println("getMethods:"+cls.getMethods().length);
//			System.out.println("isInterface:"+cls.isInterface());
		}
		public static Class<?> getClass(String wholeClassName){
			Class<?> cls = null;
			try {
				cls = Class.forName(wholeClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return cls;	
		}
		public static Constructor<?>[] getConstructors(Class<?> cls){
			Constructor<?>[] constructors = cls.getConstructors();
			return constructors;			
		}
		
		public static <T> T getObject(Class<T> cls){
			T newInstance = null;
			try {
				newInstance = cls.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			return newInstance;
		}
 		
}
