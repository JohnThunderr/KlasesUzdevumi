package Day_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {


//        int[][] arr2D = {
//        };
//        int[] temp = arr2D[0];
//        arr2D[0] = arr2D[2];
//
//
//
//        for(int i = 0; i< array2D.length; i++){
//            for (int j = 0; j< array2D[i].length; j++){
//                System.out.printf("%-5d", array2D[i][j]);
//            }
//            System.out.println();
//        }

        /**
         *
         * Izveidot 2D masīvu un userim ļaut izvēlēties:
         * 1) aizpildīt masīvu pašam
         * 2) nejaušības kārtā aizpildīt masīvu.
         */


        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        int d;

        r.nextInt(5, 10);
        int x = r.nextInt(5, 10);
        int[][] array2D = new int[r.nextInt(2, 4)][r.nextInt(2, 4)];

        System.out.println("""
                1] Aizpildīt masīvu ar nejauši uzģenerētām vērtībām
                2] Aizpildīt masīvu manuāli
                """);
        userInput = sc.nextInt();
        switch (userInput) {
            case 1:
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        array2D[i][j] = r.nextInt(0, 101);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        System.out.printf("%-5d", array2D[i][j]);
                    }
                    System.out.println();
                }
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        System.out.printf("Masīva elements [%d][%d]", i, j);
                        array2D[i][j] = sc.nextInt();
                        sc.nextLine();
                    }
                }
                sc.close();
                break;
            default:
                System.out.println("Ivadītā izvēle neatbilst paredzētajām operācijām");

        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%-5d", array2D[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        for (int row = 0; row < array2D.length; row++) {
            for (int column = 0; column < array2D[row].length; column++) {

                if (column == row) ;// (column==twoAr[row].length-row-1)

//                {00, 01, 02, 03, 04, 05},
//                {10, 11, 12, 13, 14, 15},
//                {20, 21, 22, 23, 24, 25}

                else
                    array2D[row][column] = 0;

            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%-5d", array2D[i][j]);
            }
            System.out.println();
        }



//        int[][] twoAr = new int[4][4];
//        int maxVar = twoAr[0][0];
//        int rowIndex = 0;
//        int columnIndex = 0;
//
//        for (int row = 0; row < twoAr.length; row++) {
//            for (int column = 0; column < twoAr[row].length; column++) {
//
//                if (twoAr[row][column] > maxVar) {
//                    maxVar = twoAr[row][column];
//                    rowIndex = row;
//                    columnIndex = column;
//                }
//            }
//        }


//
//                for (int row = 0; row < twoAr.length; row++) {
//            for (int column = 0; column < twoAr[row].length; column++) {
//
//                if (column==row) // (column==twoAr[row].length-row-1)
//                    twoAr[row][column] = 1;
//                else
//                    twoAr[row][column] = 0;
//
//            }
//        }
//        for (int row = 0; row < twoAr.length; row++) {
//            for (int column = 0; column < twoAr[row].length; column++) {
//                System.out.printf("%5d", twoAr[row][column]);
//            }
//            System.out.println();
//        }


    }
}
