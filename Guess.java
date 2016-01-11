import java.util.Scanner;
import java.util.Random;
public class Guess
{

  public static void main(String[] args)
  {
    boolean repeat = true;
    while (repeat)
    {
      System.out.println("I  have a number between 1 and 100.");
      System.out.println("Can you guess my number?");
      System.out.println("Please type your first guess.");
      int guess = -1;
      Random ran = new Random();
      int answer = ran.nextInt(100) + 1;
      int tries = 0;
      while (guess != answer)
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
      repeat = playAgain();
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
  public static boolean playAgain(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Do you want to play again? (Y/N): ");
    String guess=scan.nextLine();
    //System.out.println(guess.equals("Y"));
    return (guess.equals("Y"));
  }
  
}
