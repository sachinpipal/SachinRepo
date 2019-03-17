package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		
		
		Map<Integer, String>testMap=new HashMap<>();
		testMap.put(1, "A");
		testMap.put(2, "B");
		testMap.put(3, "A");
		testMap.put(4, "D");
		testMap.put(5, "A");
		testMap.put(6, "D");
		System.out.println( " testMap : "+testMap);
		testMap=new TreeMap<>(testMap);
		System.out.println(" testMap  "+testMap);
		testMap.values().removeIf(x->x.equals("A"));
		System.out.println( " testMap After removal : "+testMap);
		int d=Integer.MIN_VALUE;
		System.out.println( " testMap After removal : "+Math.abs(d%5));
		System.out.println(Math.abs(d));
		
		StringBuilder a=new StringBuilder("10");
		StringBuilder b=new StringBuilder("30");
		doSomething(a,b);
		System.out.println("a ="+a +"b="+b);
		int e=10;
		int f=20;
		doSomething(e,f);
		System.out.println("e ="+e +"f="+f);

	}

	private static void doSomething(StringBuilder x, StringBuilder y) {
		x.append(y);
		x=y;
	}
	private static void doSomething(int x, int y) {
		x=x+y;
		y=5;
	}
	

}
