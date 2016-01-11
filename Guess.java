/* Daphne KH and Nick 
 * Jan 11, 2016
 * github practice with random number guessing game
 * 
 * run this file and enter guesses as prompted
 * sample input/output:
I have a number between 1 and 100.
Can you guess my number?
Please type your first guess.
Your Guess: 
 [50]
Too high. Try again.
Your Guess: 
 [25]
Too low. Try again.
Your Guess: 
 [38]
Too high. Try again.
Your Guess: 
 [31]
Too high. Try again.
Your Guess: 
 [29]
Too high. Try again.
Your Guess: 
 [27]
Too high. Try again.
Your Guess: 
 [26]
Excellent! You guessed the number! You guessed in 6 tries.
Do you want to play again? (Y/N): 
 [Y]
I have a number between 1 and 100.
Can you guess my number?
Please type your first guess.
Your Guess: 
 [50]
Too low. Try again.
Your Guess: 
 [75]
Too high. Try again.
Your Guess: 
 [62]
Too high. Try again.
Your Guess: 
 [56]
Too low. Try again.
Your Guess: 
 [59]
Too low. Try again.
Your Guess: 
 [61]
Excellent! You guessed the number! You guessed in 5 tries.
Do you want to play again? (Y/N): 
 [N]
> 
 */


import java.util.Scanner;
import java.util.Random;
public class Guess
{
   //main method, does not expect any arguments
  public static void main(String[] args)
  {
    boolean repeat = true;
    while (repeat)
    {
       //prints intial message
      System.out.println("I have a number between 1 and 100.");
      System.out.println("Can you guess my number?");
      System.out.println("Please type your first guess.");
      int guess = -1;
      Random ran = new Random();
      int answer = ran.nextInt(100) + 1;
      int tries = 0;
      while (guess != answer)// the user correctly guessing will end the loop
      {
       guess = getInput();
       if (guess < answer)
       {
        System.out.println("Too low. Try again.");
       }
       else if (guess > answer)
       {
        System.out.println("Too high. Try again.");
       }
       else
       {
         System.out.println("Excellent! You guessed the number! You guessed in " + tries + " tries.");
       }
       tries++;
      }
      repeat = playAgain(); //based on boolean from playAgain, determines whether the user wants to play the game again or not
    }
  }
  
  //returns the number from the user
  private static int getInput()
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Your Guess: ");
    int guess=scan.nextInt();
    return guess;
  }
  
  //play again method
  //returns true if the user enters Y, false otherwise
  public static boolean playAgain()
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Do you want to play again? (Y/N): ");
    String guess=scan.nextLine();
    //System.out.println(guess.equals("Y"));
    return (guess.equals("Y"));
  }
  
}
