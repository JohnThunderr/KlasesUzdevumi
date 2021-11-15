package Day_14;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameMethodised {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(1001);
        int triesLimit = 8;
        int initialTry = 1;
        greetText();

        while (initialTry <= triesLimit) {

            int playerInput = gettingUserInput();
            String caseSelected = theGuessing(playerInput, randomInt);
            clueGiver(caseSelected, initialTry);
            moveCounter(caseSelected, initialTry);
            nearEndWarning(initialTry,triesLimit);
            initialTry++;
        }
    }

    
    static int gettingUserInput() {
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        return userGuess;
    }
    static String theGuessing(int inputFromPlayer, int generatedInt) {

        String casePicker = (inputFromPlayer == generatedInt) ? "0" :
                (inputFromPlayer >= generatedInt + 100) ? "1" :
                        (inputFromPlayer >= generatedInt + 50) ? "2" :
                                (inputFromPlayer >= generatedInt + 25) ? "3" :
                                        (inputFromPlayer >= generatedInt + 10) ? "4" :
                                                (inputFromPlayer >= generatedInt + 5) ? "5" :
                                                        (inputFromPlayer >= generatedInt + 2) ? "6" :
                                                                ((inputFromPlayer <= generatedInt + 2) && (inputFromPlayer > generatedInt)) ? "7" :
                                                                        (inputFromPlayer <= generatedInt - 100) ? "8" :
                                                                                (inputFromPlayer <= generatedInt - 50) ? "9" :
                                                                                        (inputFromPlayer <= generatedInt - 25) ? "10" :
                                                                                                (inputFromPlayer <= generatedInt - 10) ? "11" :
                                                                                                        (inputFromPlayer <= generatedInt - 5) ? "12" :
                                                                                                                (inputFromPlayer <= generatedInt - 2) ? "13" :
                                                                                                                        ((inputFromPlayer >= generatedInt - 2) && (inputFromPlayer < generatedInt)) ? "14" :
                                                                                                                                "This should never happen (short if)";
        return casePicker;
    }
    static void clueGiver(String casePicker, int currentTry) {
        switch (casePicker) {
            case "0":
                System.out.printf("""
                                          CONGRATULATIONS!!
                              
                                      You have guessed correctly!!
                                    It took You %d tries to guess right""", currentTry);
                break;
            case "1":
                System.out.println("You way too far above. More than 100 units on top, to be more precise");
                break;
            case "2":
                System.out.println("You too far above. More than 50 units on top, to be more exact");
                break;
            case "3":
                System.out.println("You are at least 25 units higher than You are supposed to");
                break;
            case "4":
                System.out.println("Not bad. More than 10 units on top");
                break;
            case "5":
                System.out.println("It's warm. You are close, but still few units above target");
                break;
            case "6":
                System.out.println("Getting hotter. Couple of units above target");
                break;
            case "7":
                System.out.println("It's very hott. You almost there. Just a tiny bit too much");
                break;
            case "8":
                System.out.println("You way too far below. More than 100 units under, to be more precise");
                break;
            case "9":
                System.out.println("You too far below. More than 50 units under, to be more exact");
                break;
            case "10":
                System.out.println("You are at least 25 units under than You are supposed to");
                break;
            case "11":
                System.out.println("Not bad. More than 10 units underneath");
                break;
            case "12":
                System.out.println("It's warm. You are close, but still few units under target");
                break;
            case "13":
                System.out.println("Getting hotter. Couple of units under target");
                break;
            case "14":
                System.out.println("It's very hott. You almost there. Just a tiny bit too few");
                break;

            default:
                System.out.println("This should never happen (switch case)");
        }

    }
    static void moveCounter(String casePicker, int currentTry) {
        if(!casePicker.equals("0"))
            switch (currentTry) {
                case 1:
                    System.out.printf("This is Your %d" + "st guess", currentTry); break;
                case 2:
                    System.out.printf("This is Your %d" + "nd guess", currentTry); break;
                case 3:
                    System.out.printf("This is Your %d" + "rd guess", currentTry); break;
                default:
                    System.out.printf("This is Your %d" + "th guess", currentTry);
            }

    }
    static void nearEndWarning(int current, int Limit) {
        String warningAboutLastMoves = (Limit - current == 3) ? "Careful, You have 3 tries left" :
                (Limit - current == 2) ? "Try harder, last 2 tries" :
                        (Limit - current == 1) ? "Caution! This is Your last chance" : "";
        System.out.println(warningAboutLastMoves);

    }
    static void greetText() {
        System.out.printf("""
                     -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
                                       Welcome To Guessing game
                    Computer has generated a number between 0 and 1000. Players
                    task is to guess that number in 8 tries or less. After every
                    guess there will be hint to help out on the next guess.
                   
                                    
                        Good Luck!!""");
    }


}
