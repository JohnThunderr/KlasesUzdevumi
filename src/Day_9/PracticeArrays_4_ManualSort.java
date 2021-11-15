package Day_9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PracticeArrays_4_ManualSort {

    public static void main(String[] args) {


        //Remove element from array
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//
//        System.out.println("Original Array : "+Arrays.toString(my_array));
//
//        // Remove the second element (index->1, value->14) of the array
//        int removeIndex = 1;
//
//        for(int i = removeIndex; i < my_array.length -1; i++){
//            my_array[i] = my_array[i + 1];
//        }
//        // We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//        System.out.println("After removing the second element: "+Arrays.toString(my_array));
////
////        //Teoretiskais uzdevums => kā dabūt normālu array, lai pēdējais elements neatkārtojas?



//        //Swapping elments
//        int[] iAr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(iAr));
//
////        iAr[0] = iAr[3];
////        iAr[3] = iAr[0];
//
//
//        int temp = iAr[0];
//        iAr[0] = iAr[3];
//        iAr[3] = temp;
//
//        System.out.println(Arrays.toString(iAr));




        int[] array = {4,2,1,3,5,9,6,8,7}; // {1,2,3,4,5,6,7,8,9}
                                            //{9,2,3,4,5,6,7,8,1}

        for(int i = 0 ; i < array.length;i++){
            for(int j = i+1 ; j< array.length;j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        //reverse array
//        for(int i = 0 ; i < array.length/2 ; i++){
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(array));

        /**
         * Array (String / int / vai jebko citu) [ cik vēlamies ]
         * Elementus arraya, sakaārtot augošā vai alfaetiskā secībā. (neizmantojot Array.sort())
         * Apgriezt otrādi (jeb pēdējais elements ir pirmā vietā, un pirmais lemenets ir mas;iva beigās)
         *
         */

    }
    }
