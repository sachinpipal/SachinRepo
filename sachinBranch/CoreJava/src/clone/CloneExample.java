package clone;

public class CloneExample {

	public  void abc(String[] args)  {
		Child child = new Child();
		//child.clone();
		System.out.println("child hashCode :" + child.hashCode());
	}
	
	protected void myName() {
		System.out.println("sachin");
	}
}

class Child extends Parent{

	public Child() {
		System.out.println("child constructor called");
	}

	private int childAge = 10;
	private String name = "ravi";

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Parent {
	public Parent() {
		System.out.println("Parent constructor called ");
	}

	private int parentAge = 50;
	private String name = "RajKumar";

	public int getParentAge() {
		return parentAge;
	}

	public void setParentAge(int parentAge) {
		this.parentAge = parentAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
