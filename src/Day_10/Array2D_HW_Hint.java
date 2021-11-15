package Day_10;

import java.util.Arrays;

public class Array2D_HW_Hint {
    public static void main(String[] args) {

        int[][] array = {
                {3, 7, 4, 1},
                {6, 1, 2, 9},
                {9, 8, 3, 5}
        };

        //5.) Veic katras rindas elementu kārtošanu dilstošā secībā

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++)
                    if (array[i][j] > array[i][k]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
            }
        }
        System.out.println(Arrays.deepToString(array));


        //6.) Apmaina masīva 1. rindu un pēdējo rindu ar vietām

        int[] temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length-1] = temp;


        System.out.println(Arrays.deepToString(array));



    }
}

