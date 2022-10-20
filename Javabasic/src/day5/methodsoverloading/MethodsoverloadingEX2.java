package day5.methodsoverloading;

public class MethodsoverloadingEX2 {

	public void square() {
		System.out.println("in method no parameter is called = ");

	}
	public void square(int number) {
		int square = number*number;
		System.out.println("in method intger parameter is called = "+square);

	}
	public void square(float number) {
		float square = number*number;
		System.out.println("in method float parameter is called = "+square);

	}
	public static void main(String[] args) {
	MethodsoverloadingEX2 obj = new MethodsoverloadingEX2();//object creation for nonstaic methd/variable

		obj.square(2.5f);
		obj.square();
		obj.square(5);
	
	}

	



}
