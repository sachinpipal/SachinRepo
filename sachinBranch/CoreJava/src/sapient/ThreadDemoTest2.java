package sapient;

public class ThreadDemoTest2  extends Thread {

	public static void main(String[] args) {
		try {
			Thread thread=new Thread(new ThreadDemoTest2());
			thread.start();
			thread.run();
			thread.wait();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	@Override
	public void start() {
		System.out.println("start called");
	}
	public void run() {
		System.out.println("run called");
	}
	/*public void wait() {
		System.out.println("wait called");
	}*/

}
