package learning;

import java.util.Scanner;

	public class AmicableNumberCheck
	{
	    public static void main(String[] args){
	        Scanner Scanner = new Scanner(System.in);
	        System.out.println("Enter the first number: ");
	        int num1 = Scanner.nextInt();
	        System.out.println("Enter the second number: ");
	        int num2 = Scanner.nextInt();

	        if (areAmicable(num1, num2))
	        {
	            System.out.println(num1 + " and " + num2 + " are Amicable numbers.");
	        } else {
	            System.out.println(num1 + " and " + num2 + " are not Amicable numbers.");
	        }
	    }

	    // Function to check if two numbers are Amicable numbers
	    public static boolean areAmicable(int num1, int num2) {
	        if (num1 == sumOfDivisors(num2) && num2 == sumOfDivisors(num1)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    // Function to calculate the sum of proper divisors of a number
	    public static int sumOfDivisors(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) {
	                sum += i;
	            }
	        }
	        return sum;
	    }
	}


