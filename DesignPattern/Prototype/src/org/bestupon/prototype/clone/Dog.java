package org.bestupon.prototype.clone;
/**
 * ������û��ʵ�ֿ�¡���������ʵ�ֿ�¡�����������Ƚ�
 *
 */
public class Dog implements Cloneable{
	/**
	 * ��������
	 */
	public int legCounts;

	public Dog(int legCounts) {
		this.legCounts = legCounts;
	}
	/**
	 * �ı乷��������
	 */
	public void changeLegCounts(){
		this.legCounts *=2;
	}
	
	@Override
	public Dog clone() throws CloneNotSupportedException {
		return (Dog)super.clone();
	}
	public String toString () {
		return Integer.toString(this.legCounts);
	}
}
