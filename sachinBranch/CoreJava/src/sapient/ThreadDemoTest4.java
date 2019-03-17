package sapient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemoTest4 {

	public static void main(String[] args) {
		new ThreadEx().start();
		new ThreadEx(new RunnableEx()).start();
		/*ExecutorService executorService=Executors.newCachedThreadPool();
		executorService.submit(task);*/
	}

}
class ThreadEx extends Thread{

	private RunnableEx runnableEx;

	public ThreadEx(RunnableEx runnableEx) {
		this.runnableEx=runnableEx;
	}
	
	public ThreadEx() {
	}

	@Override
	public void run() {
		System.out.println("inside ThreadEx");
		
	}
}
class RunnableEx implements Runnable{

	@Override
	public void run() {
		System.out.println("inside RunnableEx");
		
	}
	
	
}