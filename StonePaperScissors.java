import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper", "Scissors"};

        while (true) {
            System.out.println("Enter your move (Stone, Paper, or Scissors). Type 'exit' to quit:");
            String userMove = scanner.nextLine();

            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            int computerIndex = random.nextInt(3);
            String computerMove = choices[computerIndex];

            System.out.println("Computer chose: " + computerMove);

            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (
                (userMove.equalsIgnoreCase("Stone") && computerMove.equals("Scissors")) ||
                (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Stone")) ||
                (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))
            ) {
                System.out.println("You win!");
            } else if (
                userMove.equalsIgnoreCase("Stone") ||
                userMove.equalsIgnoreCase("Paper") ||
                userMove.equalsIgnoreCase("Scissors")
            ) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid move. Please try again.");
            }

            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}
