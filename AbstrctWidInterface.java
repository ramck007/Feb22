import java.util.*;

interface Animal2{
	String s();
	String c();
	
}
abstract class dog2 implements Animal2{
	public String s(){
		return "Bow Bow";
	}
	
}
class cat2 extends dog2{
	public String c(){
		return "Meow Meow";
	}
}
public class AbstrctWidInterface {
	public static void main(String[] args) {
		//Animal2 a1= new dog2();
		Animal2 a = new cat2();
		System.out.println("Dog Makes: "+a.s());
		System.out.println("Cat Makes: "+a.c());
	}

}

