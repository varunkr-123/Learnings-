package learning;

import java.util.Scanner;

	public class DecimalToBinary {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a decimal number: ");
	        int decimal = scanner.nextInt();
	        String binary = convertDecimalToBinary(decimal);
	        System.out.println("The binary representation of " + decimal + " is: " + binary);
	    }

	    // Function to convert decimal to binary
	    public static String convertDecimalToBinary(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        }
	        StringBuilder binary = new StringBuilder();
	        while (decimal > 0) {
	            int remainder = decimal % 2;
	            binary.insert(0, remainder);
	            decimal = decimal / 2;
	        }
	        return binary.toString();
	    }
	}








