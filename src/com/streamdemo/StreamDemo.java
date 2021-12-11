package com.streamdemo;

import java.util.*;
import java.util.stream.*;

//process even no element from collection and store it in another collection.
// increase each element by twice value.
public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println(al);
		//after filtering the elements based on condition, i want to generate new list 
		List<Integer> l= al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		//generate updated elements and map to new list by map configuration
		List<Integer> l1= al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l1);
		
		//count method, to count elements in stream
		long count=al.stream().filter(i->i<25).count();
		System.out.println(count);
		
		//sort the elements in stream ,bydefault natural sorting order, ascending order.
		List<Integer> sl=al.stream().sorted().collect(Collectors.toList());
		System.out.println(sl);
		
		//custom shorting order by comparator, i want in descending order
		
		Comparator<Integer> c=(I1,I2)->(I1<I2)?1:(I1>I2)?-1:0;
		
		List<Integer> cl=al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(cl);
		
		// find the max and min element from stream
		int i=al.stream().min((I1,I2)->-I1.compareTo(I2)).get();
		System.out.println(i);
		
		
	}

}
