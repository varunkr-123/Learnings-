package learning;

public class TemperatureConverter {
	    public static void main(String[] args){
	        double celsius = 28.0;
	        double fahrenheit = convertCelsiusToFahrenheit(celsius);
	        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
	    }

	    // Function to convert Celsius to Fahrenheit
	    public static double convertCelsiusToFahrenheit(double celsius){
	        return (celsius * 9/5) + 32;
	    }
	}



