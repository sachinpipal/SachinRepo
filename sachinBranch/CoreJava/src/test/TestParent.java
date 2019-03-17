package test;

public class TestParent {

	public static void main(String[] args) {
        String s1 = "Hi this is  first." + "\n" + "senetence";
        System.out.println(s1);
		Parent  parent=new child();
		System.out.println(parent.m1(new Object()));
		MyInterface interface1=new Parent();
		System.out.println(interface1.toString());
		
	}
}
@FunctionalInterface
interface MyInterface{
	public void myMethod();
	public int hashCode();
}
class Parent implements MyInterface{
	public int m1(Object obj) {
		try {
			return 1;
			//throw new IllegalArgumentException();
			
		} catch (Exception e) {
			System.out.println("catch");
			//return 2;
		}
		finally {
			System.out.println("parent callled");
			return 3;
		}
	
	}

	@Override
	public void myMethod() {
		
		
	}
}
class child extends Parent{
	public void m1(String str){
		System.out.println("child callled");
	}
/*	public int m1(Object obj){
		System.out.println("child  obj callled");
	}*/
}
