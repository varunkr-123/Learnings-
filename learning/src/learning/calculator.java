package learning;


class InvalidInputException extends Exception
  {
	public String tostring()
	{
		return "Cannot add 8 and 9";
	}
	
	public String getmessage()
	{
		return "I am getmessage()";
	}
  }

class CustomCalculator 
 {
   
	 double add(double a , double b) throws InvalidInputException
      { 
		 if (a==8 || b==9){
		    throw new InvalidInputException();
		   }
		return a + b;
	  }
	
	double subtract(double a , double b) 
	  {
		return a - b;
	  }
	
	double multiply(double a , double b) 
	  {
		return a * b;
	  }
	
	double division(double a , double b) 
	  {
		return a / b;
	  }
	
  }

public class calculator{
	public static void main(String[] args) throws InvalidInputException
	{
		CustomCalculator c = new CustomCalculator();
		c.add(8,9);
	   
		
	}

}
