package sapient;

public class ThreadDemoTest5 extends Thread {

	public static void main(String[] args) {
		ThreadDemoTest5 demoTest5=new ThreadDemoTest5();
		ThreadDemoTest5 demoTest51=new ThreadDemoTest5();
		demoTest5.start();
		demoTest51.start();
	}
	public void start() {
		System.out.println(" start overidden");
	}
	@Override
	public void run() {
		System.out.println("run called");
	}
}
