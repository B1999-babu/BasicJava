
public class Human1 {
	
	String name;
	String favorateColor;
	int age;
	String Address;
	
	
	public Human1(String name, String favorateColor, int age, String Address) {
		super();
		this.name = name;
		this.favorateColor = favorateColor;
		this.age = age;
		this.Address = Address;
	}
	
	public void print() {
		System.out.println("My name is "+name);
		System.out.println("My favorate Color is "+favorateColor);
		System.out.println("I am "+age+" years old");
		System.out.println("My address is "+Address);
	}

}
