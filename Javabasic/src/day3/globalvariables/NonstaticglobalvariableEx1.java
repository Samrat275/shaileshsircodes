package day3.globalvariables;

public class NonstaticglobalvariableEx1 {
 int age=25;
double salary =55.333;

float roi =7.5f;
	public static void main(String[] args) {
NonstaticglobalvariableEx1 r1 =new NonstaticglobalvariableEx1();
	System.out.println("the age of ram is "+r1.age);
	System.out.println("the salary of ram is "+r1.salary);
	NonstaticglobalvariableEx1 r2= new NonstaticglobalvariableEx1();
	System.out.println("roi = "
			+ ""+r2.roi);

	
}
	

	
}
