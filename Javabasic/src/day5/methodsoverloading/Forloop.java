package day5.methodsoverloading;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n*****Print in CAP*********");

		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1 + " ");
					}
		
		System.out.println("***********************");
for (char c1 = 'Z';c1>='A'; c1--) {
	System.out.print(c1 + " ");
} 

	}

}
