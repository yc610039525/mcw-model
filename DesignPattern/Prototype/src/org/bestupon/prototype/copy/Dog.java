package org.bestupon.prototype.copy;
/**
 * ͬʵ���˿�¡���������ʵ�ֿ�¡�����������Ƚ�
 *
 */
public class Dog {
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
	public String toString () {
		return Integer.toString(this.legCounts);
	}
}
