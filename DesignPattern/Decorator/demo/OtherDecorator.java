package decorator.demo;

/**
 * ����������ӵ���Ķ���
 * @author Nicholas
 *
 */
public abstract class OtherDecorator extends Cake{
	Cake cake;
	/**
	 * ����һ��Cake.
	 * �ñ�װ���߽���װ����֮�С������õ��ǹ��췽��ע�롣
	 * �����Ϳ��Ե���Cakeʵ���ķ����ˡ�
	 * @param cake
	 */
	public OtherDecorator(Cake cake){
		this.cake=cake;
	}
	/**
	 * ��װ���������඼ȥʵ��getRemark������ҵ����Ҫÿ��װ������Ҫ��������
	 */
	public abstract String getRemark();
}
