package Day_5;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {
        // Izveidot kalkulatoru kas nejauši uzģenerē 2 float tipa mainīgos
        // random = (min + Math.random()) * (max - min);

        // Piedāvā lietotājam izvēlēties darbību ( + , - , * , / )
        // Veic attiesīgo darbību
        // Uz ekrāna noprintē izvēlētos skaitļus un rezultātu visu noapaļojot
        // līdz 3 zīmēm aiz komata
        boolean keepGoing = true;
        while (keepGoing) {

            Random r = new Random();
            Scanner sc = new Scanner(System.in);

            float generatedFloat1 = r.nextFloat(100.0f);
            float generatedFloat2 = r.nextFloat(100.0f);

            String userInput = sc.nextLine().trim();

            switch (userInput) {
                case "+":
                    double result = generatedFloat1 + generatedFloat2;
                    generatedFloat1 = Math.round(generatedFloat1 * 1000) / 1000.0f;
                    generatedFloat2 = Math.round(generatedFloat2 * 1000) / 1000.0f;

                    String formatResult = String.format("\nSumma ir: %.3f", result);
                    System.out.println("Skaitlis 1: " + generatedFloat1
                            + "\nSkaitlis 2: " + generatedFloat2 + formatResult
                            + "\nPilnā vērtība datorā paliek: " + result);
                    break;
                case "-":
                case "*":
                case "/":
                default:
                    System.out.println("Input not recognized");
            }

            System.out.println("Atkārtot kalkulātoru? \n         Y / N");
            String endRun = sc.nextLine();
            if (endRun.equalsIgnoreCase("Y"))
                keepGoing = true;
            else {
                System.out.println("Paldies! Uz redzēšanos!!");
                keepGoing = false;
            }
        }

    }
}
