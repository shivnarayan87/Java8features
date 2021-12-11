package com.predifenedfuncionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//custom type Student take input for Function interface.
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
}

public class CustomFIDemo {
	public static void main(String[] args) {
		Function<Student,String> f=s->{
			int mark=s.marks;
			String grade="";
			if(mark>=80) grade= "Distinction";
			else if(mark>=60) grade= "Firs class";
			else if(mark>=50) grade= "Second class";
			else grade="fail";
			return grade;
			
		};
		Predicate<Student> p=s->s.marks>=60;
		
		Consumer<Student>c=st->{
			System.out.println("Student name:  "+st.name);
			System.out.println("Student marks:  "+st.marks);
			System.out.println("Student grade:  "+f.apply(st));
			System.out.println();
		};
		
		Student[]s= {new Student("shiv",100),
					new Student("ishant",70),
					new Student("priya",30),
					new Student("raju",55)};
//		for(Student stu:s) {
//			if(p.test(stu)) {
//				System.out.println("Student name:  "+stu.name);
//				System.out.println("Student marks:  "+stu.marks);
//				System.out.println("Student grade:  "+f.apply(stu));
//				System.out.println();
//			}
//			
//			
//		}
		
		for(Student stu:s) {
			if(p.test(stu)) {
				c.accept(stu);
			}
			
			
		}
	}
	

}
