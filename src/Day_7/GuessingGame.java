package Day_7;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int generatedInt = r.nextInt(1001);
        int triesLimit = 8;
        int initialTry = 1;
        int playerPreviousInput = 0;
        int logicalOptionsLeft = 1001;
        double chanceOnGuessingRightInNextTurn = 1.0 / logicalOptionsLeft;
        System.out.println(generatedInt);
        greetText();

        while (initialTry <= triesLimit) {
            int playerInput = sc.nextInt();
            int diffBetweenPlayer2Guesses = playerInput - playerPreviousInput;
            playerPreviousInput = playerInput;


            String casePicker = (playerInput == generatedInt) ? "0" :
                    (playerInput > generatedInt) ? "44" :
                            (playerInput < generatedInt + 100) ? "45" :

                            (playerInput >= generatedInt + 100) ? "1" :
            (playerInput >= generatedInt + 50) ? "2" :
            (playerInput >= generatedInt + 25) ? "3" :
            (playerInput >= generatedInt + 10) ? "4" :
            (playerInput >= generatedInt + 5) ? "5" :
            (playerInput >= generatedInt + 2) ? "6" :
            ((playerInput <= generatedInt + 2) && (playerInput > generatedInt)) ? "7" :
            (playerInput <= generatedInt - 100) ? "8" :
            (playerInput <= generatedInt - 50) ? "9" :
            (playerInput <= generatedInt - 25) ? "10" :
            (playerInput <= generatedInt - 10) ? "11" :
            (playerInput <= generatedInt - 5) ? "12" :
            (playerInput <= generatedInt - 2) ? "13" :
            ((playerInput >= generatedInt - 2) && (playerInput < generatedInt)) ? "14" :
            "This should never happen (short if)";

            switch (casePicker) {
                case "0":
                    System.out.printf("""
                                          CONGRATULATIONS!!
                              
                                      You have guessed correctly!!
                                    It took You %d tries to guess right""", initialTry);
                    break;
                case "1":
                    System.out.println("You way too far above. More than 100 units on top, to be more precise");
                    logicalOptionsLeft = logicalOptionsLeft - diffBetweenPlayer2Guesses;
                    break;
                case "2":
                    System.out.println("You too far above. More than 50 units on top, to be more exact");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "3":
                    System.out.println("You are at least 25 units higher than You are supposed to");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "4":
                    System.out.println("Not bad. More than 10 units on top");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "5":
                    System.out.println("It's warm. You are close, but still few units above target");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "6":
                    System.out.println("Getting hotter. Couple of units above target");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "7":
                    System.out.println("It's very hott. You almost there. Just a tiny bit too much");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "8":
                    System.out.println("You way too far below. More than 100 units under, to be more precise");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "9":
                    System.out.println("You too far below. More than 50 units under, to be more exact");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "10":
                    System.out.println("You are at least 25 units under than You are supposed to");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "11":
                    System.out.println("Not bad. More than 10 units underneath");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "12":
                    System.out.println("It's warm. You are close, but still few units under target");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "13":
                    System.out.println("Getting hotter. Couple of units under target");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;
                case "14":
                    System.out.println("It's very hott. You almost there. Just a tiny bit too few");
                    logicalOptionsLeft = logicalOptionsLeft - playerInput;
                    break;

                default:
                    System.out.println("This should never happen (switch case)");
            }
            if(!casePicker.equals("0"))
                switch (initialTry) {
                    case 1:
                        System.out.printf("This is Your %d" + "st guess", initialTry); break;
                    case 2:
                        System.out.printf("This is Your %d" + "nd guess", initialTry); break;
                    case 3:
                        System.out.printf("This is Your %d" + "rd guess", initialTry); break;
                    default:
                        System.out.printf("This is Your %d" + "th guess", initialTry);
                }


            String warningAboutLastMoves = (triesLimit - initialTry == 3) ? "Careful, You have 3 tries left" :
                                           (triesLimit - initialTry == 2) ? "Try harder, last 2 tries" :
                                           (triesLimit - initialTry == 1) ? "Caution! This is Your last chance" : "";
            System.out.println(warningAboutLastMoves);


            if (generatedInt - playerInput < 0)
                chanceOnGuessingRightInNextTurn = 1.0 / (1001 - (generatedInt - playerInput));
            else if (generatedInt - playerInput > 0)
                chanceOnGuessingRightInNextTurn = 1.0 / (1001 - playerInput);

            System.out.printf("Chances for guessing right in the next move are :%.3f%c", chanceOnGuessingRightInNextTurn, '%');


            initialTry++;
        }
    }
    static void greetText() {
        System.out.printf("""
                     -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
                                       Welcome To Guessing game
                    Computer has generated a number between 0 and 1000. Players
                    task is to guess that number in 8 tries or less. After every
                    guess there will be hint to help out on the next guess.
                    Game also will calculate Your chances of guessing the right
                    number in Your next guess. Chances for 1st guess to be correct
                    is %.3f%c
                                    
                        Good Luck!!""");
    }

}

