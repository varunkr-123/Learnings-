package learning;
import java.util.Random;
import java.util.Scanner;



class game
{ 
	public int number;
	public int inputnumber;
	public int numofGuesses = 0;
	
	  public int getnumofGuesses()
	     {
		  return numofGuesses ;
	     }
	  public void setnumofGuesses(int numofGuesses)
	     {
		  this.numofGuesses = numofGuesses ;
	     }
	  
	 game() 
	 {
		 Random rand = new Random();
		 this.number = rand.nextInt(100);
	 }
	 void takeUserInput()
	 {
		 System.out.println("\nGuess the number:" );
		 Scanner sc = new Scanner(System.in);
		 inputnumber = sc.nextInt();
	 }
	 boolean isCorrectNumber()
	 {   
		 numofGuesses++;
		 if (inputnumber == number)
		     {
		     System.out.format("Yes you guessed it right,it was %d . \nYou guessed it in %d attemps." , number , numofGuesses);
			
		     }
		 else if(inputnumber < number)
		     {
			 System.out.println("Too less....");
		     }
		 else if(inputnumber > number)
	     {
		 System.out.println("Too high....");
	     }
		 return false;
	 }
	
}





public class gameexercise
{
	public static void main(String[] args) 
	{
		game g = new game();
		boolean b = false ;
		   while(!b){
		   g.takeUserInput();
	       b = g.isCorrectNumber();
	      	}
	}

}
