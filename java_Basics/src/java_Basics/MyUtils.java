package java_Basics;

public class MyUtils {
	
	public static void PrintSomeOne(String baburao) {
		System.out.println("this is out side of the method: "+baburao);
	}
	
	public static void PrintSomeOne(int argument) {
		System.out.println("this is integer value: "+argument);
	}

	public static void sum2Numbers(int firstarg, int secondarg) {
		System.out.println(firstarg+secondarg);	
		
		
	}
	public static int add10(int someArgument) {
		int result=someArgument+10;
		return result;
	}
}
