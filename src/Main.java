import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1, die2, crapsRoll, point;
        boolean playAgain;
        String continueYN = "";

        do {
          die1 = rnd.nextInt(6) + 1;
          die2 = rnd.nextInt(6) + 1;
          crapsRoll = die1 + die2;

            System.out.println("You rolled: " + die1 + " + " + die2 + " = " + crapsRoll);

          if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll ==12) {
              System.out.println("You crapped out! You lose!");
          }
          else if(crapsRoll == 7 || crapsRoll == 11) {
              System.out.println("You rolled a natural! You win!");
          }
          else {
              point = crapsRoll;
              System.out.println("The point is now: " + point);
              do {
                  die1 = rnd.nextInt(6) + 1;
                  die2 = rnd.nextInt(6) + 1;
                  crapsRoll = die1 + die2;

                  System.out.println("You rolled: " + die1 + " + " + die2 + " = " + crapsRoll);

                  if (crapsRoll == point) {
                      System.out.println("Made point and won! " + point);
                  }
                  else if (crapsRoll == 7) {
                      System.out.println("You rolled a 7! You lose!");
                  }
                  else {
                      System.out.println("Trying for point");
                  }
              } while(crapsRoll != point && crapsRoll != 7);
          }

          System.out.println("Play again? [Y/N]: ");
          continueYN = in.nextLine();

        }while (continueYN.equalsIgnoreCase("Y"));
    }
}

