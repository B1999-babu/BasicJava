package java_Basics;

public class ControllFlow {

	public static void main(String[] args) {
		
		//if else statement in boolean
	
		boolean hungry=true;
		 
		if(hungry) {
			System.out.println("i am starving");
		}else {
			System.out.println("i am not hungry");
		}
		
		
		//if else statement in int
		int hungerRating=5;
		if(!(hungerRating<6)) {
			System.out.println("Not hungry");
		}
		else
		{
			System.out.println("I am Starving");
		}
		
		   
		
		//if else statement in int
		int favorateTemp=75;
		int currentTemp=100;
		String opinion;
		
		if(currentTemp<favorateTemp-30) {
			opinion="It's pretty darn cold";
		}
		else if(currentTemp<favorateTemp-20) {
			opinion="It's kind cold out";
		}
		else if(currentTemp>favorateTemp+10) {
			opinion="It's hot out";
		}
		else
		{
			opinion="It's beautiful day";
		}
		
		System.out.println(opinion);
		
		
		
		
		//switch statement
		
		int month=6;
		String monthstring;
		
		switch(month) {
		case 1: monthstring="january";
		break;
		case 2: monthstring="february";
		break;
		case 3: monthstring="march";
		break;
		case 4:monthstring="April";
		break;
		default:monthstring="invalid month";
		break;
		
		}
	System.out.println(monthstring);

	}
}
