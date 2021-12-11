package com.java8features;
import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		//System.out.println("Square root of 4:  "+square(4));
	//	Function<Integer, Integer> f=i->i*i;
		//System.out.println("Square root of 4:  "+f.apply(4));
		
		Predicate<Integer> p=i->i%2==0;
	System.out.println(p.test(4));
//		System.out.println(p.test(5));
		

		
		
		
	}
	
//	public static int square(int i) {
//		return i*i;
//		
//	}
	

}
