package java_Basics;

import SomeOthePackage.ExampleClass;

public class LearningMethods {

	public static void main(String args[]) {
		System.out.println("inside the method");
		MyUtils.PrintSomeOne("hello world");
		MyUtils.PrintSomeOne(456);
		MyUtils.sum2Numbers(12,35);
		int myval=MyUtils.add10(70)+1000-80;
		System.out.println(myval);
		ExampleClass.doSomeThig();
	}

	
}

