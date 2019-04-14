package assignment1;

import java.io.IOException;
import java.util.Scanner;

//Define a Student class (roll number, name, percentage). Define a default and
//parameterized constructor. Override the toString method. Keep a count objects created.
//Create objects using parameterized constructor and display the object count after each
//object is created. (Use static member and method). Also display the contents of each
//object.

public class Student {
	static int count;
	public int rollno;
	public String name;
	public double percent;
	
	Student(int rollno,String name , double percenta){
		this.rollno=rollno;
		this.name=name;
		this.percent=percenta;
	}
	public String toString(){
		 
		return "roll Number : "+ rollno + '\n'+"Name : " + name +'\n'+ "percentage : " + percent;
		
	}

	public static void main(String[] args) throws IOException {
		int n,rolln;
		String name;
		double percenta;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Students");
		n=sc.nextInt();
		
		Student s[]=new Student[n];
		System.out.println("Enter the data of student");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter roll number");
			rolln=sc.nextInt();
			
			System.out.println("Enter name of student");
			name=sc.next() ;
					
			System.out.println("enter percentage");
			percenta=sc.nextDouble();
			
			Student.count++;
			s[i]= new Student(rolln,name,percenta);
		}
		
		
		for(int i=0;i<n;i++)
		    System.out.println( s[i] );
		}

}
