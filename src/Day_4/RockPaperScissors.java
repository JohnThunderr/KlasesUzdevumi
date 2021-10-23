package Day_4;

import java.util.Random;
import java.lang.String;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String[] options = {"Akmens" , "Sķēres" , "Papīrs"};
        int randomCPUPick = r.nextInt(3);

        System.out.println("""
                Lūdzu izvēlieties Akmeni, Šķēres vai Papīru nospiežot attiecīgo ciparu uz klaviaturās:
                1] Akmens
                2] Sķēres
                3] Papīrs""");
        int playerPick = sc.nextInt();

        if((playerPick >= 1) && (playerPick <= 3))
            System.out.println("Spēlētājs izvēlējās: " + options[playerPick-1]);
        else{
            System.out.println("Izvēle nav pieejama!");
            System.exit(playerPick);
        }

        if ((playerPick == 1) && (randomCPUPick == 0) || (playerPick == 2) && (randomCPUPick == 1) || (playerPick == 3) && (randomCPUPick == 2))
            System.out.println("Neizšķirts!! \n Spēlētājs izvēļējās " + options[playerPick-1]
                    + " un Dators izvēlējās " + options[randomCPUPick]);
        else if ((playerPick == 1) && (randomCPUPick == 2) || (playerPick == 2) && (randomCPUPick == 0) || (playerPick == 3) && (randomCPUPick == 1))
            System.out.println("Uzvar spēlētājs!! \n Spēlētājs izvēļējās " + options[playerPick-1]
                    + " un Dators izvēlējās " + options[randomCPUPick]);
        else if ((playerPick == 1) && (randomCPUPick == 1) || (playerPick == 2) && (randomCPUPick == 2) || (playerPick == 3) && (randomCPUPick == 0))
            System.out.println("Uzvar Dators!! \n Spēlētājs izvēļējās " + options[playerPick-1]
                    + " un Dators izvēlējās " + options[randomCPUPick]);
        else
            System.out.println("Error in logic, this was not supposed to happen");





    }
}
