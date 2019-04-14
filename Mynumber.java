package assignment1;
import java.util.Scanner;

 
public class Mynumber {
	private int Number;
	
	Mynumber(){
		Number=0;
		
	}
	
	public Mynumber(int data) {
		this.Number=data;
	}
	public void isZero(int data)
	{
		if(data==0)
		{
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Number is not zero");
		}
	}
	public void ispositve(int data) {
		if(data>0)
		System.out.println("Number is Positive");
	}
	
	
	public void isnegative(int data) {
		if(data <0)
			System.out.println("number is negative");
	}
	
	public void isodd(int data)
	{
		if(data%2==1)
		{
			System.out.println("Number is odd ");
		}
	}

	public void iseven(int data) {
		if(data%2==0)
			System.out.println("Number is even");
	}
	
	public static void main(String args[]) {
		Mynumber num= new Mynumber(10);
		int data ;
		 Scanner sc=new Scanner(System.in) ;
		 System.out.println("Enter Number");
		 data=sc.nextInt();
		 
		 num.isZero(data);
		num.iseven(data);
		num.isodd( data);
		num.ispositve(data);
		num.isnegative(data);
		 
	}
}
