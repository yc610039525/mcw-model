package org.bestupon.prototype.demo;

public class Product implements Cloneable {
	/**
	 * ����һ
	 */
	private String property1;
	/**
	 * ���Զ�
	 */
	private String property2;
	@Override
	public Product clone() throws CloneNotSupportedException {
		return (Product)super.clone();
	}
	public String getProperty1() {
		return property1;
	}
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	public String getProperty2() {
		return property2;
	}
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	
}
