import java.util.Observable;
import java.util.Observer;

public class MailObserver implements Observer{

	/**
	 * �����ȡ��ΪMailObserver������˼�壬����һ�����������ʼ��Ĺ۲���
	 */
	public void update(Observable o, Object arg) {
		System.out.println("�����ʼ��Ĺ۲����Ѿ���ִ��");
	}

}
