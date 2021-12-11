package com.byfunctiondemo;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
//BiFunction functional interface accept two input arguments and one output parameter
public class ByFunctionDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p=(c,d)->(c+d)%2==0;
		System.out.println(p.test(10,20));
		
		BiFunction<Integer,Integer, Integer> f=(a, b)-> a+b ;
		System.out.println(f.apply(10,20));
	}

}
