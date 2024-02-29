package learning;
	
import java.util.Scanner;

	public class EmployeeAllowanceCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the basic salary of the employee: ");
	        double basicSalary = scanner.nextDouble();

	        double travelAllowance = calculateTravelAllowance(basicSalary);
	        double dearnessAllowance = calculateDearnessAllowance(basicSalary);
	        double houseRentAllowance = calculateHouseRentAllowance(basicSalary);

	        System.out.println("Travel Allowance (TA): $" + travelAllowance);
	        System.out.println("Dearness Allowance (DA): $" + dearnessAllowance);
	        System.out.println("House Rent Allowance (HRA): $" + houseRentAllowance);
	    }

	    // Function to calculate Travel Allowance (TA)
	    public static double calculateTravelAllowance(double basicSalary) {
	        return 0.08 * basicSalary;
	    }

	    // Function to calculate Dearness Allowance (DA)
	    public static double calculateDearnessAllowance(double basicSalary) {
	        return 0.12 * basicSalary;
	    }

	    // Function to calculate House Rent Allowance (HRA)
	    public static double calculateHouseRentAllowance(double basicSalary) {
	        return 0.2 * basicSalary;
	    }
	}



