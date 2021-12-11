package com.optionaldemo;

import java.util.Optional;

//optional class handle abnormal termination of program due to nullpointer exception
// it also helps not unnecesray check null pointer  exception multiple times in code.
// its final class came in java 1.8
public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String>o= null;
		String[] s= new String[5];
		s[0]="ram";
		s[1]="shyam";
		//System.out.println(s[0].toUpperCase());
		for(String str:s) {
			System.out.println(str);
			o=Optional.ofNullable(str);		
			if(o.isPresent()) {
				System.out.println("value is :"+o.get().toUpperCase());
			}else {
				
				System.out.println("value does not exist.");
			}
			
			
		}
		
		
	
		
		
	}

}
