package Day_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeArrays_2 {

    public static void main(String[] args) {

        /**
         * Masīvs ar 30 int tipa elementiem (kas satur divus ciparus)
         * Pieprasīt Lietotājam ievadīt uz klaviaturas skaitļus.
         * Ar ciklu palīdzību sameklēt masīvā šo skaitli un atgriezt uz ekrāna
         * Ja nav, tad atgriezt error message.
         *
         * Atrastajam elementam no masīva atgriež uz ekrāna gan vērtību
         * gan tā indexu masīvā.
         *
         * Lai katrs masīva elements būtu unikāls.(Lai katra vērtība neatkārtotos
         * vairāk kā vienu (1) reizi)
         *
         * Visu masīva elementu vidējo vērtību, maximālo un minimālo
         */

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] intArr = new int[30];
        int userInput;

        int maxValue = 0;
        int minValue = intArr.length;

        int sum = 0;
        double avgValue = (double)sum / intArr.length;


        // Fill
        for(int i=0; i< intArr.length; i++){
            intArr[i] = r.nextInt(10, 100);
            for(int j=0; j<i; j++){
                if(intArr[i] == intArr[j])
                    i--;
            }
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println("Lūdzu ievadiet divciparu skaitli no klaviatūras:");
        userInput = sc.nextInt();

        System.out.println();


        //Search
        int internalFoundElementCounter = 0;
        for(int i=0; i< intArr.length; i++){

            if(userInput == intArr[i]) {
                System.out.println("User input of " + userInput + " matches element in array with value of " +
                        intArr[i] + " with and index of " + i);
                internalFoundElementCounter++;
            }
        }
        if(internalFoundElementCounter == 0)
            System.out.println("No matches found between user input (" + userInput +") and values in Array");



        //Max / Avg / Min
        for(int i=0; i< intArr.length; i++){
            if(intArr[i] > maxValue)
                maxValue = intArr[i];
            if(intArr[i] < minValue)
                minValue = intArr[i];





            sum = sum + intArr[i];
        }
        System.out.println("Average element value of array is " + avgValue);
        System.out.println("Max " + maxValue + " and Min " + minValue);


    }
}
