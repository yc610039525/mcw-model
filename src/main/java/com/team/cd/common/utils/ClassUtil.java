package com.team.cd.common.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.lang3.ClassUtils;

public class ClassUtil {
	/**
	 * 获取到的参数 返回值 是Class
	 * @param obj
	 */
	public static void printClassMethodMessage(Object obj){
		Class<? extends Object> c = obj.getClass();
		System.out.println("获取Name:"+c.getName());
		Method[] ms = c.getMethods();
		//c.getDeclaredMethods()
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
			System.out.println(ClassUtils.getPackageName("com.team.cd.common.utils"));
			Class<?> class1 = ClassUtils.getClass("com.team.cd.common.utils.ClassUtil");
			Object newInstance = class1.newInstance();
			((ClassUtil)newInstance).test();
			System.out.println(ClassUtils.getShortClassName(class1));
			Constructor<?>[] constructors = class1.getConstructors();
		}
}
