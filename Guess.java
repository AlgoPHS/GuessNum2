import java.util.Scanner;
public class GuessANumber
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
      int answer = Random.nextInt(100) + 1;
      while (guess != answer)
      {
       
  
  }
  
  //returns the number from the user
  private static int getInput()
  {
    Scanner scan=new Scanner();
    System.out.println("Your Guess: ");
    int guess=scan.nextInt();
    return guess;
  }
  //play again method
  public boolean playAgain(){
    Scanner scan=new Scanner();
    System.out.println("Do you want to play again? (Y/N): ");
    String guess=scan.nextLine();
    return (guess=="Y");
  }
  
}
