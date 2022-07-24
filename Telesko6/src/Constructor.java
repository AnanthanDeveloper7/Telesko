
public class Constructor {
	public static void main(String[] args) {
		Alien a1=new Alien();
		a1.show();
//		new Alien().show();                                  // call a show() method
		
	}
}
class Alien{
	String name ="Ananth";
	int age = 24;
	String tech = "Developer";
	int salary = 5000;
	

	public Alien() 
	{
	System.out.println("This is constructor ");
	
	}
	public void show() {
	System.out.println("Is show mwthod");
	}
}

