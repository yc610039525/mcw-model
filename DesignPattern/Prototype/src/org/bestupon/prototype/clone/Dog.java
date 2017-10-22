package org.bestupon.prototype.clone;
/**
 * 该类是没有实现克隆方法的类和实现克隆方法的类做比较
 *
 */
public class Dog implements Cloneable{
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
	
	@Override
	public Dog clone() throws CloneNotSupportedException {
		return (Dog)super.clone();
	}
	public String toString () {
		return Integer.toString(this.legCounts);
	}
}
