package assignment1;

import java.util.Scanner;

public class StudentSort {

	private int rollno;
	private String name;
	private double percent;
	
	StudentSort()
	{
		rollno=0;
		name="not initiazil";
		percent=0;
		
	}
	
	StudentSort(int r,String n, double p)
	{
		rollno=r;
		name=n;
		percent=p;
	}
	
	public String toString() {
		return "roll Number : "+rollno+'\n'+"name of Student : "+name+'\n'+"percentage : "+percent;
	
	}
	
	public double getPrecent() {
		return percent;
	}
	
	public static void sortPercent(StudentSort[] s) { 
		int temproll;
		String tempnam;
		double tempper;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].getPrecent()<s[j].getPrecent()) {
//					StudentSort stud=s[i];
//					s[i]=s[i+1];
//					s[i+1]=stud;
					temproll=s[i].rollno;
					tempnam=s[i].name;
					tempper=s[i].percent;
					
					s[i].rollno=s[j].rollno;
					s[i].name=s[j].name;
					s[i].percent=s[j].percent;
					
					s[j].rollno=temproll;
					 s[j].name=tempnam;
					 s[j].percent=tempper;
					
					
					
				}
			}
		}
		System.out.println(":::::::list after sort :::::::::");
		for(int i=0;i<s.length;i++)
		    System.out.println( s[i] );
	}
	
	 

		
	
	public static void main(String[] args) {
		
		int n;
		int rollno;
		String name;
		double percen;
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of student");
		n=sc.nextInt();
		
		StudentSort s[]=new StudentSort[n];
		
		for(int i=0;i<n;i++) {
//		System.out.println("enter roll no ");
//		rollno=sc.nextInt();
			rollno=i+1;
			
			System.out.println("enter name ");
			name=sc.next();
			
			System.out.println("enter percentage");
			percen=sc.nextDouble();
		
		 s[i]=new StudentSort(rollno,name,percen);
		
		}
		System.out.println("::::::list before sort::::::");
		for(int i=0;i<n;i++)
		    System.out.println( s[i] );
		
		sortPercent(s);
				
		
	}
		// TODO Auto-generated method stub

	}


