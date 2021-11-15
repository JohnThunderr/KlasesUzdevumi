package Day_7;

import java.util.Scanner;

public class LoopsEx2 {

    public static void main(String[] args) {

        /** Pānemt no lietotāja tekstu
         * izvest katru simbolu jaunā rindā
         * Un katru simbolu pārvērst uz lielo burtu
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadiet tekstu:");
        String userInput = sc.nextLine();
        int loopIterations = userInput.length();
        int i = 0;

//        while (i + 1 <= loopIterations) {
//            System.out.println(userInput.toUpperCase().charAt(i++));
//        }

//        do {
//            System.out.println(userInput.toUpperCase().charAt(i++));
//        } while (i + 1 <= loopIterations);
            for (i = 0; i + 1 <= loopIterations; i++) {
                System.out.println(userInput.toUpperCase().charAt(i));

            }
    }
}
