package com.java8features;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

//lamda expression with collection
public class MyArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(34);
		l.add(2);
		
		System.out.println(l);
		Comparator<Integer> cp= (I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0 ;
		Collections.sort(l, cp);
		//System.out.println(l);
		//for each method of java 1.8
		l.stream().forEach(System.out::println);
	  List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
	  System.out.println(l2);
		
	}

}
