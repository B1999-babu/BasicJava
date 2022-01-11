package java_Basics;

public class LearningArrays {

	public static void main(String args[])
	{
		
		//arrays in int datatype
		int[] values=new int[100];
		values[0]=1000;
		values[3]=100;
		values[99]=65755;
		System.out.println(values[3]);
		System.out.println(values[99]);
		
		//arrays in double datatype
		
		double[] value=new double[100];
		value[0]=100;
		value[5]=76.34;
		value[98]=788785;
		System.out.println(value[5]);
		System.out.println(value[0]);
		System.out.println(value[98]);
		
		
		//arrays in string datatype
		String[] words=new String[3];
		words[0]="my";
		words[1]="name";
		words[2]="is";
		
		System.out.println(words[0]+ " "+words[1]+" "+ words[2]);
		
	}
}
