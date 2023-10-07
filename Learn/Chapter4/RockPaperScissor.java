import java.util.Random;
import java.util.Scanner;
/*
 * 1-> Rock
 * 2-> Paper
 * 3-> Scissor
*/

public class RockPaperScissor {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int seriesCount = 0;
        int sysScore = 0, userScore= 0;
    
        while(seriesCount < 5){
            int sysChoice = rand.nextInt(3);
            System.out.print("1 --> Rock\n2 --> Paper\n3 --> Scissor\nEnter your choice: ");

            int userChoice = in.nextInt();

            switch (userChoice) {
                case 1:
                if(sysChoice + 1 == 2){
                    sysScore += 1;
                }
                else if(sysChoice + 1 == 3){
                    userScore += 1;
                }
                break;
                case 2:
                if(sysChoice + 1 == 1){
                    userScore += 1;
                }
                else if(sysChoice + 1 == 3){
                    sysScore += 1;
                }
                break;
                case 3:
                if(sysChoice + 1 == 2){
                    userScore += 1;
                }
                else if(sysChoice + 1 == 1){
                    sysScore += 1;
                }
                break;
            }

            seriesCount += 1;
        }
        in.close();

        if(userScore > sysScore){
            System.out.println("Congratulations! You won the series with " + userScore + " points");
        }
        else if(userScore < sysScore){
            System.out.println("Sorry! You lost the series by " + (sysScore - userScore) + " points");
        }
        else{
            System.out.println("Draw series with " + userScore + " points");
        }
        
    }
    
}
