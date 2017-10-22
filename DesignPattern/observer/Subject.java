import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{
	
	/**
	 * ҵ�񷽷���һ��ִ��ĳ����������֪ͨ�۲���
	 */
	public void doBusiness(){
		if (true) {
			super.setChanged();
		}
		notifyObservers("���ڻ�û�еĲ���");
	}

	
	public static void main(String [] args) {
		//����һ�����۲���
		Subject subject = new Subject();
		
		//���������۲���
		Observer mailObserver = new MailObserver();
		Observer jmsObserver = new JMSObserver();
		
		//�������۲��߼ӵ����۲����б���
		subject.addObserver(mailObserver);
		subject.addObserver(jmsObserver);
		
		//ִ��ҵ�����
		subject.doBusiness();
	}
}
