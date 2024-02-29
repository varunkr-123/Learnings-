package learning;

public class CompareTwoObjects {

   public static void main(String[] args) 
       {
	        
	        Object obj1 = new Object();
	        Object obj2 = new Object();

	        // Comparing objects for equality
	        boolean areEqual = obj1.equals(obj2);

	        
	        if (areEqual) 
	        {
	           System.out.println("The two objects are equal.");
	        } 
	        else 
	        {
	           System.out.println("The two objects are not equal.");
	        }
	    }
	}


