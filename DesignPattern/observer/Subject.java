import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{
	
	/**
	 * 业务方法，一旦执行某个操作，则通知观察者
	 */
	public void doBusiness(){
		if (true) {
			super.setChanged();
		}
		notifyObservers("现在还没有的参数");
	}

	
	public static void main(String [] args) {
		//创建一个被观察者
		Subject subject = new Subject();
		
		//创建两个观察者
		Observer mailObserver = new MailObserver();
		Observer jmsObserver = new JMSObserver();
		
		//把两个观察者加到被观察者列表中
		subject.addObserver(mailObserver);
		subject.addObserver(jmsObserver);
		
		//执行业务操作
		subject.doBusiness();
	}
}
