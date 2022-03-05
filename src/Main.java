import java.util.Locale;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    String playerA;
    String playerB;
    String YesNo;
    boolean movePlayerA;
    boolean movePlayerB;
    boolean moveYesNo;
    boolean playAgain = false;

    do {
        do{
            System.out.println("Player A choose Rock, Paper, or Scissors [RPS]");
            playerA = in.nextLine();
            playerB = playerA.toUpperCase();

            if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                movePlayerA = true;
                do {
                    System.out.println("Player B choose Rock, Paper, or Scissors [RPS]");
                    playerB = in.nextLine();
                    playerB = playerB.toUpperCase();

                    if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                        movePlayerB = true;
                    } else {
                        movePlayerB = false;
                        System.out.println("Please enter R, P or S!");
                    }
                } while (!movePlayerB);
            } else {
                movePlayerA = false;
                System.out.println("Please enter R, P or S!");
            }
        } while (movePlayerA);
        if (playerA.equals("R")) {
            if (playerB.equals("R")) {
                System.out.println("Rock vs Rock, it is a TIE!");
            } else if (playerB.equals("P")) {
                System.out.println("Paper covers Rock, Player B wins!");
            } else //playerB is SCISSORS
            {
                System.out.println("Rock crushes Scissors, Player A wins !");
            }
        } else if (playerA.equals("P")) {
            if (playerB.equals("R")) {
                System.out.println("Paper covers ROck, Player A wins!");
            } else if (playerA.equals("P")) {
                System.out.println("Paper vs Paper, it is a TIE!");
            } else //playerB is SCISSORS
            {
                System.out.println("Scissors cut Paper, Player B wins!");
            }
        } else //PlayerA is SCISSORS
        {
            if (playerB.equals("R")) {
                System.out.println("Rock crushes Scissors, Player B wins!");
            } else if (playerB.equals("P")) {
                System.out.println("Scissors cut Paper, Player A wins!");
            } else //playerB is SCISSORS
            {
                System.out.println("Scissors vs Scissors, it is a TIE!");
            }
        }

        do {
            System.out.println("Do you want to play again? [Y/N]");
            YesNo = in.nextLine();
            YesNo = YesNo.toUpperCase();

            if (YesNo.equals("Y")) {
                moveYesNo = true;
                playAgain = true;
                System.out.println("Running program again..");
            } else if (YesNo.equals("N")) {
                moveYesNo = true;
                playAgain = false;
                System.out.println("Closing program...");
            } else {
                System.out.println("Please enter Y or N");
                moveYesNo = false;
            }
        }while(!moveYesNo);
    }while(playAgain);
    }
}
