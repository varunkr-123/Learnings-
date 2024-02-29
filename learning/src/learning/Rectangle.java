package learning;


class Rectangle1
 { 
	int length;
	int breadth;
	public int area(){
		return length * breadth;
		   }
	
    public int perimeter(){
    	return 2 * length* breadth;
		     }
   
 }

public class Rectangle 
{  
	public static void main (String[] args)
	{
		Rectangle1 obj = new Rectangle1();
		
		obj.length = 3;
		obj.breadth = 6;
	   System.out.println("Area is:" + obj.area());
		
	}
	
	 
	

}
