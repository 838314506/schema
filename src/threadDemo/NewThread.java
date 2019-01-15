package threadDemo;

public class NewThread extends Thread {

	boolean suspendFlag;

	public NewThread(String threadName, ThreadGroup tgob) {
		super(tgob, threadName);
		System.out.println("New Thread :" + this);
		suspendFlag = false;
		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Exception in " + getName());
		}
		System.out.println(getName() + " exiting.");
	}

	public synchronized void mysuspend() {
		suspendFlag = true;
	}
	
	public synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}
