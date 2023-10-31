import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (true) 
        {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". You have " + maxAttempts + " attempts to guess it.");
            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == targetNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    score++;
                    break;
                } 
                else 
                if (userGuess < targetNumber) 
                {
                    System.out.println("Too low. Try again.");
                } 
                else 
                {
                    System.out.println("Too high. Try again.");
                }
            }
            if (!hasGuessedCorrectly) 
            {
                System.out.println("You've run out of attempts. The correct number was " + targetNumber + ".");
            }
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) 
            {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;
            }
        }
        scanner.close();
    }
}
