package learning;
import java.util.Scanner;

 public class RockPaperScissors
{
       public static void main (String[] args ) 
       {
    	String sign1 , sign2 ;
    	   
    	   System.out.print("Enter sign1:");
    	   Scanner sc = new Scanner(System.in);
    	   sign1 = sc.next();
    	   
    	   System.out.print("Enter sign2:");
    	   Scanner sc1 = new Scanner (System.in);
    	   sign2 = sc.next();
    	   
    	   
    	   
    	   if (sign1=="rock" && sign2=="paper" || sign1=="paper" && sign2=="rock")
    	   {
    		   System.out.println ("Paper won");
    	   }
    	   else if (sign1=="rock" && sign2=="scissors" || sign1=="scissors" && sign2=="rock" )
    	   {
    		   System.out.println ("Rock won");
    	   }
    	   else if (sign1=="paper" && sign2=="scissors" || sign1=="scissors" && sign2=="paper")
    	   {
    		   System.out.println ("Scissors won");
    	   }
    	   else 
    		   System.out.println ("Wrong sign inputed");
    	   
       }
       
 }
 
    		   
    	
    	   
    	   
    	 
    	   
    	   
    	   
    	   
       /*   import java.util.Scanner;
    	 import java.util.Random;

    	   public class RockPaperScissors {
    	       public static void main(String[] args) 
    	       {
    	           Scanner scanner = new Scanner(System.in);
    	           Random random = new Random();
    	           
    	           String[] choices = {"rock", "paper", "scissors"};
    	           
    	           System.out.println("Welcome to Rock-Paper-Scissors game!");
    	           System.out.println("Enter your choice: rock, paper, or scissors");
    	           String playerChoice = scanner.nextLine().toLowerCase();
    	           
    	           if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) 
    	           {
    	               System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
    	               return;
    	           }
    	           
    	           int computerChoiceIndex = random.nextInt(3);
    	           String computerChoice = choices[computerChoiceIndex];
    	           
    	           System.out.println("Computer chose: " + computerChoice);
    	           System.out.println("You chose: " + playerChoice);
    	           
    	           if (playerChoice.equals(computerChoice)) {
    	               System.out.println("It's a tie!");
    	           } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
    	                      (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
    	                      (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
    	               System.out.println("You win!");
    	           } else {
    	               System.out.println("Computer wins!");
    	           }
    	       }
    	    }       
       */
