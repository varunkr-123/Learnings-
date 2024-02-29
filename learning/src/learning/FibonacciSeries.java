package learning;

public class FibonacciSeries {
	
	public static void main(String[] args)
	 {
		int n = 10;
		int num1 = 1 ; 
		int num2 = 2 ;
		int nextnum ; 
		 
		 System.out.print("The fibonacci series for "+ n +  " numbers is : "); 
		
		   for (int i = 1; i <= n ; i++ )
		   {
			    System.out.print(num1 + " , ");
			    nextnum = num1 + num2 ;
			    num1 = num2;
			    num2 = nextnum ; 
			    
		   }
	 }
}
