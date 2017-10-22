package org.bestupon.prototype.copy;
/**
 * 同实现了克隆方法的类和实现克隆方法的类做比较
 *
 */
public class Dog {
	/**
	 * 狗腿条数
	 */
	public int legCounts;

	public Dog(int legCounts) {
		this.legCounts = legCounts;
	}
	/**
	 * 改变狗的腿数量
	 */
	public void changeLegCounts(){
		this.legCounts *=2;
	}
	public String toString () {
		return Integer.toString(this.legCounts);
	}
}
