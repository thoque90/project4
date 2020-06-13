package ConditonalStatements;

public class Constructorss {
	String housename;
	public int address;
	int value=20;
   static int age=10;
	
	
public static void methods() {
	System.out.println("My brother age is: "+age);
	
	
	
}
	
	public Constructorss(String housename, int address) {
		this.housename=housename;
		this.address=address;
		System.out.println(housename +" "+ address);
		}
		
		public Constructorss(int value) {
			this.value=value;
			System.out.println(value);
			
		}
	
	public void student(int P_ID) {

		System.out.println(P_ID);
	}
	
	
	
	
}
