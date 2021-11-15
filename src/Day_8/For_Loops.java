package Day_8;

import java.util.Scanner;

public class For_Loops {

    public static void main(String[] args) {


        /** Uzrakstīt programmu kas printē šādi:
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         * 1234567
         * 12345678
         * 123456789
         * 12345678910
         */

        {

            for (int i = 1; i <= 10; i++) {
                for ( int j = 1; j <= i; j++)
                    System.out.print(j);

                System.out.println();
            }
        }
    }
}
