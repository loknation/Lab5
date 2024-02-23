import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.print("Guess the number (between 1 and 10): ");
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();
            System.out.println("The random number was: " + randomNumber);
            if (userGuess == randomNumber) {
                System.out.println("You win");
            }
            else if (userGuess < randomNumber) {
                System.out.println("low");
            }
            else {
                System.out.println("high");
            }
        }
        else {
            System.out.println("bro put in a number");
        }
    }
}
