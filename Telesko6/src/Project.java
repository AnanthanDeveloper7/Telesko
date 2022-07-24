
public class Project {
	public static void main(String[] args) {
		Alien obj1= new Alien();
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		obj1.code();
		
	}

}

class Alien{
	String name ="Ananth";
	int age = 24;
	String tech = "Developer";
	int salary = 5000;
	

public void code() 
{
	System.out.println("hai ");
	
}
}