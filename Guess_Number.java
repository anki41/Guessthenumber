import java.util.Random;
import java.util.*;
public class Guess_Number {
    public static void main(String args[]){
        Random rand  = new  Random();
        int TargetNumber = rand.nextInt(100) + 1; //Generate a random number between 1 to 100
        int attempts =0;

        Scanner sc = new Scanner(System .in);
        int guess;
        System.out.println("Welcome to the Guess Number Game");
        System.out.println ("You have Select a Number Between 1 to 100");
        System.out.println();

           while (true){
            if (attempts >10)//the Number of attempts
            {
                System.out.println("Sorry , The Number of attempts is end .");
                break;
            }
            System.out.println("Enter The Guess Number"); //ask to enter value
            guess = sc.nextInt();
            attempts++; // keep the count of attempts

              if (guess == TargetNumber)//check whether the guess is equal to the target number
              {
                System.out.println("Congratulation! you guess the correct number" +TargetNumber+ "in" +attempts+"attempts");
                System.out.println();
                break;
              }
               else if(guess < TargetNumber)  //checking whether the guess is less than the target number
               {
                System.out.println("You guess is too less , Try again");
                System.out.println();      
           }
           else //checking whether the guess is more than the target number
           {
            System.out.println("You guess is to high ,Try again");
            System.out.println();
           }
        }
      sc.close();

    }

}
