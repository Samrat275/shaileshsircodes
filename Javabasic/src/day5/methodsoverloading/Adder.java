package day5.methodsoverloading;

 class Adder {                            //here class is not public
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b,int c) {
		return a+b+c;


}
	
}
 
  class Methodsoverloading2{
	 
		public static void main(String[] args) {
			System.out.println(Adder.add(11, 11));
			System.out.println(Adder.add(11, 11, 11));
			System.out.println("************************************************");
			Methodsoverloading2.square();
			MethodsoverloadingEX2.square(2.56);
			MethodsoverloadingEX2.square(25);
			System.out.println("***********************************");
			//access non-static member of the class
			 
			Methodsoverloading m1= new Methodsoverloading();
			m1.square();
			m1.square(25);
			m1.square(5.3f);
		
		}
			
		}