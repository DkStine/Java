import java.util.Scanner;
import java.util.Random;

class Game{
    private int noOfGuesses = 0;
    private int sysGuess;
    private int userGuess;
    Scanner in = new Scanner(System.in);

    private void userGuess(){
        System.out.print("Enter your guess: ");
        int n = in.nextInt();
        this.noOfGuesses += 1;
        this.userGuess = n;
        
    }
    private boolean checkNumber(int userGuess){
        if (userGuess < sysGuess){
            System.out.println("Your number is smaller");
            return false;
        } 
        if (sysGuess < userGuess){
            System.out.println("Your number is larger");
            return false;
        }
        return true;
        
    }
    private int getGuesses(){
        return this.noOfGuesses;
    }

    public Game(){
        Random rand = new Random();
        this.sysGuess = rand.nextInt(1, 101);
    }
    public void startGame(){
        while (true) {
            userGuess();
            boolean decision = checkNumber(userGuess);
            if (decision){
                System.out.printf("This is the correct number! and you guessed it in %d tries.", getGuesses());
                in.close();
                break;
            }
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.startGame();
    }
}
