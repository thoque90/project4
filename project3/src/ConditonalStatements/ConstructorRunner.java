package ConditonalStatements;



public class ConstructorRunner {

	public static void main(String[] args) {
		Constructorss obj = new Constructorss("Tanbir",40);
		Constructorss obj1 = new Constructorss(40);
		
		
		obj.student(10);
		System.out.println(obj1.value);
		Constructorss.methods();
		System.out.println("My sister age is: "+Constructorss.age);
          
	}

}
