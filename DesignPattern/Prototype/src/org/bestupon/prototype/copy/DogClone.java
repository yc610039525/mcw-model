package org.bestupon.prototype.copy;

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
		return (DogClone)super.clone();
	}
	
}
