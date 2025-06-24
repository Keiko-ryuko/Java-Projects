package game;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1;
        int guess = 0, tries = 0;
        
        System.out.println("Guess the number between 1 and 100: ");
        while (guess != number) {
            guess = sc.nextInt();
            tries++;
            if (guess < number)
                System.out.println("Too low");
            else if (guess > number)
                System.out.println("Too high");
                else 
                    System.out.println("Correct! You guessed it after " + tries + " tries.");
        }
        sc.close();
    }
    
}