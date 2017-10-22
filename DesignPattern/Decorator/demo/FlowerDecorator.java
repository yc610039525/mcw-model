package decorator.demo;

/**
 * ��������ӵĻ�
 * @author Nicholas
 *
 */
public class FlowerDecorator extends OtherDecorator{
	
	/**
	 * ���캯��
	 * ����һ��cakeʵ����Ҳ����ǰ����ʵ�ֵ�Cake�����࣬�����ҵ��⣬�ɿ�������ȵȡ�
	 * @param cake
	 */
	public FlowerDecorator(Cake cake){
		super(cake);//���ø���Ĺ��췽�������Ի�ȡCake��ʵ���ˡ��Ϳ��Ե���Cakeʵ���ķ���.
		super.remark="һ��õ�廨";
	}
	
	/**
	 * ʵ����װ�����������getImpression������
	 */
	public String getImpression() {
		//�����ص㡣����ͨ�����췽�������cakeʵ������cake������װ�Σ��������µĹ��ܡ�
		return cake.getImpression()+","+"����һ�仨����happy";
	}

	public String getRemark() {
		return cake.getRemark()+"+"+super.remark;
	}
}
