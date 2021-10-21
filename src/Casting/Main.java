package Casting;

import java.util.Random;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String[] izvēles = {"Akmens" , "Sķēres" , "Papīrs"};
        int randomCPUPick = r.nextInt(3);

        System.out.println("Lūdzu izvēlieties Akmeni, Šķēres vai Papīru nospiežot attiecīgo ciparu uz klaviaturās:" +
                "\n1] Akmens" + "\n2] Sķēres" + "\n3] Papīrs");
        int playerPick = sc.nextInt();

        if((playerPick >= 1) && (playerPick <= 3))
            System.out.println("Spēlētājs izvēlējās: " + izvēles[playerPick-1]);
        else{
            System.out.println("Izvēle nav pieejama!");
            System.exit(playerPick);
        }

        if ((playerPick == 1) && (randomCPUPick == 0) || (playerPick == 2) && (randomCPUPick == 1) || (playerPick == 3) && (randomCPUPick == 2))
            System.out.println("Neizšķirts!! \n Spēlētājs izvēļējās " + izvēles[playerPick-1]
                    + " un Dators izvēlējās " + izvēles[randomCPUPick]);
        else if ((playerPick == 1) && (randomCPUPick == 2) || (playerPick == 2) && (randomCPUPick == 0) || (playerPick == 3) && (randomCPUPick == 1))
            System.out.println("Uzvar spēlētājs!! \n Spēlētājs izvēļējās " + izvēles[playerPick-1]
                    + " un Dators izvēlējās " + izvēles[randomCPUPick]);
        else if ((playerPick == 1) && (randomCPUPick == 1) || (playerPick == 2) && (randomCPUPick == 2) || (playerPick == 3) && (randomCPUPick == 0))
            System.out.println("Uzvar Dators!! \n Spēlētājs izvēļējās " + izvēles[playerPick-1]
                    + " un Dators izvēlējās " + izvēles[randomCPUPick]);
        else
            System.out.println("Error in logic, this was not supposed to happen");





    }
}
