package sapient;

public class ThreadDemoTest  extends Thread implements Runnable{

	public static void main(String[] args) {
		try {
			Thread thread=new Thread(new ThreadDemoTest());
			thread.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
