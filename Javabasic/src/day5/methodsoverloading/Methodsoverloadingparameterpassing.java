package day5.methodsoverloading;

public class Methodsoverloadingparameterpassing {
static double res;
	public static void square(double number) {
		res = number*number;
		System.out.println("method with double argument called = "+res);

	}
	public static void square() {
		System.out.println("no parameter is called in this method = ");

	}
	public static void square(int number) {
		res = number*number;
		System.out.println("method with integer argument called = "+res);

	}
	public static void square(float number) {
		res = number*number;
		System.out.println("method with float argument called = "+res);
	}
	public static void main(String[] args) {
		Methodsoverloadingparameterpassing.square(25);
		Methodsoverloadingparameterpassing.square();
		Methodsoverloadingparameterpassing.square(2.5f);
	

	}
}
