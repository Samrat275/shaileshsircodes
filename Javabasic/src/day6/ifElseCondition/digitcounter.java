package day6.ifElseCondition;

public class digitcounter {
	int num=12345789;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int counter=0;
digitcounter c1=new digitcounter();// by different way using global type
		
		for(;c1.num>0;c1.num=c1.num/10) {
			counter++;
		}
		System.out.println("count of digit is equal to  "+counter);
	}
	

}
