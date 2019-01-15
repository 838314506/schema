package threadDemo;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		//���������߳���
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
		//��ÿ���߳�������߳�
		NewThread ob1 = new NewThread("One", groupA);
		NewThread ob2 = new NewThread("Two", groupA);
		
		NewThread ob3 = new NewThread("Three", groupB);
		NewThread ob4 = new NewThread("Four", groupB);
		
		System.out.println("here is output from list()");
		//չʾ�߳����еľ�����Ϣ
		groupA.list();
		groupB.list();
		
		System.out.println();
		
		System.out.println("suspend group a");
		Thread[] tga = new Thread[groupA.activeCount()];
		//��ȡ�߳����е��߳���Ϣ
		groupA.enumerate(tga);
		//������a�е�1��2�����̣߳������߳���ִ��
		for (int i = 0; i < tga.length; i++) {
			((NewThread)tga[i]).mysuspend();
		}
		//4���1��2�ָ̻߳�����
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted.");
		}
		
		System.out.println("resuming group a");
		
		for (int i = 0; i < tga.length; i++) {
			((NewThread)tga[i]).myresume();
		}
		//�ȴ������߳̽���
		System.out.println("waiting for thread finish.");
		try {
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		} catch (InterruptedException e) {
			System.out.println("exception in main thread");
		}
		
		System.out.println("main thread exiting");
	}

}
