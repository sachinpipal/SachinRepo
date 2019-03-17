package sapient;

public class ThreadDemoTest1  extends Thread {

	public static void main(String[] args) {
		try {
			Thread thread=new Thread(new ThreadDemoTest1());
			thread.start();
			Thread thread1=new Thread(new ThreadDemoTest1());
			thread1.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public void run() {
		System.out.println("run called");
		System.out.println("state :"+Thread.currentThread().getState());
		System.out.println("Alive :"+Thread.currentThread().isAlive());
	}

}
