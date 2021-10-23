package Day_5;

import java.util.Scanner;

public class ScannerTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        if (sc.hasNextDouble())
            System.out.println(sc.nextDouble());
        //sc.nextLine()

        System.out.println("Ievadi boolean: ");
        if (sc.hasNextBoolean())
            System.out.println(sc.nextBoolean());
        //sc.nextLine()

        System.out.println("Ievadi skaitli: ");
        if (sc.hasNextLine())
            System.out.println(sc.nextLine());
        //sc.nextLine()










        /** Izveidot punktu sistēmu, kas piešķir punktu par katru veiksmīgu operāciju
         * programmas beigās sasummē punktus un izved uz ekrāna
         * **/
    }
}
