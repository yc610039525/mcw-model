package org.bestupon.prototype.copy;

public class DogClone implements Cloneable {
	/**
	 * ��������
	 */
	public int legCounts;
	/**
	 * ��ʼ��һ����
	 */
	Dog dog = new Dog(4);
	@Override
	protected DogClone clone() throws CloneNotSupportedException {
		return (DogClone)super.clone();
	}
	
}
