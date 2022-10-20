package day5.methodsoverloading;

public class ConditionsIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	//Creating two variables for age and weight    
				int age=20;    
				int weight=48;  
			
				//applying condition on age and weight    
				if(age>=18)	{      
				if(weight>40){    
						System.out.println("You are eligible to donate blood");    
					} else{  
						System.out.println("You are not eligible to donate blood");    
					}  
				} else{  
				  System.out.println("Age must be greater than 18");  
				}  */
		System.out.println("*************************************new EX ************");
		int age=18;
		int weight=51;
		if (age>=18)
		if (weight>=50){
			System.out.println("you are eligible to donate blood");
		}
		else {
			System.out.println("You are not eligible to donate");
		}
		else {
			System.out.println("Age must be equal or greater than 18");
		}

	}

}
