package learning;

	
import java.util.Scanner;

	public class ArmstrongNumberCheck {
	    public static void main(String[] args){
	        int number, originalNumber, remainder, result = 0, n = 0;
	        Scanner Scanner = new Scanner(System.in);
	        System.out.println("Enter a number to check if it's an Armstrong number: ");
	        number = Scanner.nextInt();

	        originalNumber = number;

	        // store the number of digits of the number
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }

	        originalNumber = number;

	        // check if the number is an Armstrong number
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }

	        if (result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}




