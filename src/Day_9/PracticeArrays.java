package Day_9;
import java.util.Arrays;
import java.util.Random;

public class PracticeArrays{
    public static void main(String[] args) {

//        int myInt = 5;
//        String[] mySArr = {"AC","BC","DF"};
//        int[] myArray = new int[5];
//        myArray[0] = 6;
//        myArray[1] = 3;
//        myArray[2] = 2;
//        myArray[3] = 3;
//        myArray[4] = 7;
//
//
//        System.out.println(Arrays.toString(myArray));
//
//        myArray[3] = 9;
//
//        System.out.println(Arrays.toString(myArray));

//        for(int i = 0; i < myArray.length; i++){
//            myArray[i] ++;
//        }
//        System.out.println(Arrays.toString(myArray));

//        for(int element : myArray){
//            element ++;
//            System.out.printf("%d, ", element);
//         //   myArray[element] = element;
//        }
//        System.out.println(Arrays.toString(myArray));



        /**
         * Izveidojat masīvu ar int 8 elemntiem.
         * Ar ciklus dodamies cauri masīvam
         * un aprēķinam šo skaitļu vidējo vērtību.
         */
        Random r = new Random();
        int[] intArr = new int[30];
        double avrg;
        int sum = 0;


        // for(starta punkts; Nosacījums; Kas notiek katra loopa beigās?)
        for(int i=0; i< intArr.length; i++){
            intArr[i] = r.nextInt(10);
        }

        for(int i=0; i< intArr.length; i++){
            sum = sum + intArr[i];
        }


        System.out.println(Arrays.toString(intArr));
        avrg = sum / (double)intArr.length;
        System.out.println("Kopējais elementu skaits ir: " + intArr.length);
        System.out.println(avrg);









        //Write a Java program to find the duplicate values of an array of string values.
//        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
//
//        for (int i = 0; i < my_array.length-1; i++)
//        {
//            for (int j = i+1; j < my_array.length; j++)
//            {
//                if( (my_array[i].equals(my_array[j])) && (i != j) )
//                {
//                    System.out.println("Duplicate Element is : "+my_array[j]);
//                }
//            }
//        }
    }
}
