package org.bestupon.prototype.clone;

public class DogClone implements Cloneable {
	/**
	 * 狗腿条数
	 */
	public int legCounts;
	/**
	 * 初始化一个狗
	 */
	Dog dog = new Dog(4);
	@Override
	protected DogClone clone() throws CloneNotSupportedException {
		DogClone o = null;
		o = (DogClone)super.clone();
		o.dog = (Dog)dog.clone();
		return o;
	}
	
}
