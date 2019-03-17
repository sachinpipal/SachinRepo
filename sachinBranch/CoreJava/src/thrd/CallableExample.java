package thrd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		List<Future<String>> futureList=new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Future<String> future=executorService.submit(new MyCallable(i));
			futureList.add(future);
		}
		
		for (Future<String> future : futureList) {
			try {
				System.out.println(new Date()+" :  "+future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		List<Runnable>runnables =executorService.shutdownNow();
		for (Runnable runnable : runnables) {
			System.out.println(runnable.getClass().getName());
		}
		//executorService.submit(new MyCallable(101));
	}

}
class MyCallable implements Callable<String>{
	public int i;
	public MyCallable(int i) {
	this.i=i;
	}
	@Override
	public String call() throws Exception {
		//Thread.sleep(1000);
		/*if(i>50&& i<60) {
			Thread.sleep(4000);
		}*/
		return Thread.currentThread().getName()+" :::: "+i;
	}
	
}


