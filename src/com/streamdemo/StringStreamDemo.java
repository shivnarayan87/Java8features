package com.streamdemo;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;


// sorted the string element acoording to no of character.
public class StringStreamDemo {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("A");
		al.add("AAA");
		al.add("AA");
		al.add("AAAA");
		al.add("AA");
		Comparator<String> c=(S1,S2)->{
			int l1=S1.length();
			int l2=S2.length();
			if(l1<l2) return -1;
			else if (l1>l2) return +1;
			else return 0;
		};
		List<String> list= al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		//System.out.println(al.stream().max(c));
		String s=al.stream().max(c).get();
		System.out.println(s);
		
//		Optional<String> op=al.stream().max(c);
//		if(op.isPresent()) {
//			System.out.println(op.get());
//		}
//		
	}

}
