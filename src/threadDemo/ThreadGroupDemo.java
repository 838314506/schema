package threadDemo;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		//创建两个线程组
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
		//向每个线程组加入线程
		NewThread ob1 = new NewThread("One", groupA);
		NewThread ob2 = new NewThread("Two", groupA);
		
		NewThread ob3 = new NewThread("Three", groupB);
		NewThread ob4 = new NewThread("Four", groupB);
		
		System.out.println("here is output from list()");
		//展示线程组中的具体信息
		groupA.list();
		groupB.list();
		
		System.out.println();
		
		System.out.println("suspend group a");
		Thread[] tga = new Thread[groupA.activeCount()];
		//获取线程组中的线程信息
		groupA.enumerate(tga);
		//挂起组a中的1和2两个线程，其他线程先执行
		for (int i = 0; i < tga.length; i++) {
			((NewThread)tga[i]).mysuspend();
		}
		//4秒后1和2线程恢复运行
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted.");
		}
		
		System.out.println("resuming group a");
		
		for (int i = 0; i < tga.length; i++) {
			((NewThread)tga[i]).myresume();
		}
		//等待所有线程结束
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
