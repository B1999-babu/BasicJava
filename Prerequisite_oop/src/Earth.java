
public class Earth {
	public static void main(String args[]) {
	
	Human human=new Human();
	human.name="Baburao";
	human.age=23;
	human.eyeColor="brown";
	human.heightinInches=75;
	human.speak();
	
	human.eat();
	human.walk();
	human.jump();
	
	Human babu=new Human();
	babu.name="Irappa";
	babu.age=32;
	babu.eyeColor="brown";
	babu.heightinInches=80;
	babu.speak();
	
	
	Human1 hello=new Human1("Baburao","Red",23,"Belagavi");
	hello.print();
	
	
	

}
}
