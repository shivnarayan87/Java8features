package com.predifenedfuncionalinterface;
import java.util.function.*;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> f= i->i*i;
		System.out.println("square root of 4 is:  "+f.apply(4));
		Function<String,Integer> f1= s-> s.length();
		System.out.println("the length of string is:  "+f1.apply("shivnarayan"));
	}

}
