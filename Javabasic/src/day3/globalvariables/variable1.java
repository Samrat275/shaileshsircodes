package day3.globalvariables;

public class variable1 {
	static int age; //static global variable bcz it is declared as static 
	static double empsalary;// non-static global variable.............global variable = bcz it written in class body nd outside the main method,constructor,block
static float roi;
static boolean res;
static char grade;

	public static void main(String[] args) {
	/* local variable ====> it is declared in method body , constructor, block
		//in local variable static variable is not written..........imp
		int x,y,result;
		x=45;
		y=45;
		result=x*y;
		System.out.println("x=45,y=45,result=x*y = "+result);
*/
	// we can access/initialize static global variables from main ()
		System.out.println("Default value = "+age);
		System.out.println("Default value = "+empsalary);
		System.out.println("Default value = "+roi);
		System.out.println("Default value = "+res);
		System.out.println("Default value = "+grade);
		//reinitialize of static global variable
		age=45;
		empsalary=25000;
		roi=7.5f;
		res=true;
grade='A';			
		System.out.println("updated value ="+age);
		System.out.println("updated value ="+empsalary);
		System.out.println("updated value ="+roi);
		System.out.println("updated value ="+res);
		System.out.println("updated value ="+grade);
		
				
				
		
	}

}
