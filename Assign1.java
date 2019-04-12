
public class Assign1 {
	public static  int number;
	 static int flag=0;
	public Assign1(int x) {
		
		
		// TODO Auto-generated constructor stub
	}
	
	public static void  positive(int x)
	{
		
		if(x >0)
		{
		 System.out.println(x+" is positive");
		 
		}
		
		 
		 
	}

	public static void negative(int x)
	{
		
		if(x < 0)
		{
			System.out.println(x+" is negative");
		}
		 
		 
		 
	}
	public static void prime(int x)
	{
		//int m;
		//m=x/2;
		//for(int i=2; i<=m;i++)
		//{
		//	if(x%2==1)
		//	{
		//		System.out.println("number is prime");
		//	}
		//}
		 int i,m=0,flag=0;      
		     
		  m=x/2; 
		  
		  if(x==0||x==1)
		  {  
			  System.out.println(x+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(x%i==0)
		    {      
		    	System.out.println(x+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0) 
		   { 
			   System.out.println(x+" is prime number"); }  
		  }
		}    
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		positive(10);
		negative(-10);
		 prime(7);
	//	negative(10);
		 
	}

}
