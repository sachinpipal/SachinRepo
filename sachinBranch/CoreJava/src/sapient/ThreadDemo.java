package sapient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ThreadDemo {
	private static int x;
	public ThreadDemo() {
		x=5;
		System.out.println("ssss");
	}

	public static void main(String[] args) {
		System.out.println(x);
		//writenQuestion1();
		/*writenQuestion2();
		writenQuestion3();
		writenQuestion4();
		writenQuestion5();
		writenQuestion6();
		writenQuestion7();*/
	}

	private static void writenQuestion7() {
		x=9;
		float f=10.2f;
		double d=10.2;
		System.out.println(f==d);
		//Array(16).join("js"-1);
		
	}

	private static void writenQuestion6() {
		System.out.println(method(10,2));
	}

	private static int method(int a, int b) {
		try {
			int x=a/b;
			System.out.println(x);
			return x;
		} catch (Exception e) {
			System.out.println("exception");
		}
		return 0;
	}

	private static void writenQuestion5() {
		ThreadDemo  demo=new  ThreadDemo();
		try {
			demo.check();
		} catch (Exception e) {
			System.out.println("catch block 1");
		}
		
	}

	private void check() throws Exception {
		try {
			throw new IOException();
		}
		catch (IOException e) {
			System.out.println("catch block 2");
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("catch block 3");
		}
		finally {
			System.out.println("finally returning");
		}
		
		
	}

	private static void writenQuestion4() {
		Student stud=new Student(10);
		Student stud1=new Student(35);
		change(stud);
		System.out.println(stud.sid);
	}

	private static void change(Student stud) {
		stud.sid=stud.sid+10;
	}

	private static void writenQuestion3() {
		/*Byte byte1=new Byte(10);
		Byte byte2=new Byte(20);
		System.out.println(byte1==byte2);*/
		
	}

	private static void writenQuestion2() {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(6);
		a.add(3);
		ArrayList B=new ArrayList();
		B=(ArrayList) a.clone();
		/*B.add(2);
		B.remove(2);*/
		System.out.println(B +"B hascode :"+B.hashCode());
		System.out.println(a +"a hascode :"+a.hashCode());
		System.out.println("b equals to A :" + B.equals(a));
		System.out.println("check refernce:" + (B==a));
	}

	private static void writenQuestion1() {
		HashMap hashMap=new HashMap();
		hashMap.put("1", "two");
		hashMap.put(2, "four");
		System.out.println("this is map :"+hashMap);
		System.out.println("there are keys ");
		displayMap(hashMap.keySet());
		System.out.println("there are values ");
		displayMap(hashMap.values());
	}

	private static void displayMap(Collection A) {
		Iterator  iterator=A.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s +" ");
			
		}
	}

}
class Student{
	static int sid;
	public Student(int id) {
		this.sid=id;
	}
	
}