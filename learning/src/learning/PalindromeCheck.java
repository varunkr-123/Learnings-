package learning;

	
import java.util.Scanner;

	public class PalindromeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number to check if it's a palindrome: ");
	        int number = scanner.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome number.");
	        } else {
	            System.out.println(number + " is not a palindrome number.");
	        }
	    }

	    // Function to check if a number is a palindrome
	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number != 0) {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	}



