import java.util.Scanner;

interface Animal1{
	 String s();	
}

class Dog1 implements Animal1{
	public String s() {
		return "White";		 
	}
}

class Cat1 implements Animal1{
	public String s() {
		return "Black";
	}
}

public class InterfaceEx {
	
	public static void main(String[]args) {
		
		Animal1 A;
		A= new Dog1();
		System.out.println("Dog color is: "+ A.s());
		A = new Cat1();
		System.out.println("Cat color is: "+ A.s());

	}

}

