import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            boolean playAgain = true; // create boolean for play again option

            do {
                System.out.println("Rock, Paper, Scissors!");
                System.out.println("Player 1, shoot! [R, P, S]: "); //prompt user 1 for input
                String player1 = in.nextLine().toUpperCase(); //make input upper case in case entered incorrectly

                System.out.println("Player 2, shoot! [R, P, S]: "); //prompt user 2
                String player2 = in.nextLine().toUpperCase(); //string and make upper case

                if (player1.equals(player2)) // create tie loop
                {
                    System.out.println("It's a tie!"); // output to let user know there was a tie
                }
                else if (player1.equals("R")) // create loop for player 1 and rock
                {
                    if (player2.equals("S")) //if player 2 has scissors
                    {
                        System.out.println("Rock beats scissors! Player 1 wins."); // output for who wins
                    }
                    else //don't test for what you already know (player 2 must have paper)
                    {
                        System.out.println("Paper beats paper! Player 2 wins."); //output
                    }
                }
                else if (player1.equals("P")) // create loop for player 1 and paper
                {
                    if (player2.equals("S")) //if player 2 has scissors
                    {
                        System.out.println("Scissors beats paper! Player 2 wins."); // output for who wins
                    }
                    else //don't test for what you already know (player 2 must have rock)
                    {
                        System.out.println("Paper beats rock! Player 1 wins."); //output
                    }
                }
                else if (player1.equals("S")) // create loop for player 1 and scissor
                {
                    if (player2.equals("R")) //if player 2 has rock
                    {
                        System.out.println("Rock beats scissors! Player 2 wins."); // output for who wins
                    }
                    else //don't test for what you already know (player 2 must have paper)
                    {
                        System.out.println("Scissors beat paper! Player 1 wins."); //output
                    }
                }
                else // if other than above, there must have been invalid input
                {
                    System.out.println("Invalid input!"); // notify user
                }
                System.out.println("Play again? [Y/N]: "); // prompt user to play again
                String playAgainInput = in.nextLine().toUpperCase(); // user inputs Y or N and it is upper-cased
                playAgain = playAgainInput.equals("Y"); // if user says Y then the do while loop is repeated

            } while (playAgain); // end of play again loop

            System.out.println("Thanks for playing!"); // output to let user know end of game
    }
}