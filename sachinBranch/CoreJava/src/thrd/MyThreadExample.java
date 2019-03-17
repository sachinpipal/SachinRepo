package thrd;

public class MyThreadExample {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("run");
	}
	public void start(){
		System.out.println("start");
	}
}
