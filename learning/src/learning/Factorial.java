package learning;

import java.util.Scanner;

	public class Factorial {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        
		}
		
	    public static long calculateFactorial(int n) {
	        // Base case: factorial of 0 is 1
	        if (n == 0) {
	            return 1;
	        }
	         
	        
	        long factorial = 1;
	        
	        for (int i = 1; i <= n; i++) 
	        {
	            factorial = factorial * i;
	        }
	        
	        return factorial;
	    
	    }
	}



