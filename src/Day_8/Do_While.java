package Day_8;

import java.util.Random;

public class Do_While {

    public static void main(String[] args) {


        /**
         * Uzrakst'it programmu kas printē uz ekrāna pāra skaitļus no 1 līdz 100 augošā secībā..
         * dilstošā secībā ? nepāra skaitļus ?
         */

        /**
         * Izveidot programmu kas simulē sporta spēli starp divām komandām.
         * Spēle beidzās kad tiek sasniegts noteikts rezultāts (punkut skaits)
         * Katra komanda izdara šāvienu/metienu/spērienu ar procentuālu iespēju trāpit un netrāpīt.
         * Pirms katras punktu gūšanas darbības jāveic vismaz 2 piespēles ar 5% iespēju, ka pretinieki
         * šo piespēli pārtvers.
         * Pēc katras punktu gūšanas, komanda automatiski pārtop no uzbrucēja par aizsargu.
         *
         */


        Random r = new Random();
        String tA = "Team A";
        String tB = "Team B";
        int teamA = 0;
        int teamB = 0;
        String attackingTeam = tA;
        String defendingTeam = tB;
        String midPos = null;


        do {
            int chance = r.nextInt(0, 101);
            System.out.println("Attack has started by " + attackingTeam);
            System.out.println(attackingTeam + " gets ball past center line");

            for (int i = 0; i < 2; i++) {
                System.out.println(attackingTeam + " tries to pass the ball");
                int successfulPass = r.nextInt(0, 101);
                if (successfulPass > 5)
                    System.out.println("Ball has reached the destination");
                else {
                    System.out.println("Defenders has intercepted the ball");
                    midPos = attackingTeam;
                    attackingTeam = defendingTeam;
                    defendingTeam = midPos;
                }
            }
            System.out.println(attackingTeam + " takes a shot");
            if (chance <= 60) {
                System.out.println(attackingTeam + " scores 2 pints");
                if (attackingTeam.equals("Team A")) {
                    teamA = teamA + 2;
                } else {
                    teamB = teamB + 2;
                }
                midPos = attackingTeam;
                attackingTeam = defendingTeam;
                defendingTeam = midPos;


            } else if ((chance > 60) && (chance <= 80)) {
                System.out.println(attackingTeam + " scores 3 pints");
                if (attackingTeam.equals("Team A")) {
                    teamA = teamA + 3;
                } else {
                    teamB = teamB + 3;
                }
                midPos = attackingTeam;
                attackingTeam = defendingTeam;
                defendingTeam = midPos;

            }
            else{
                System.out.println( attackingTeam+ "misses the shot and plays as defenders");
            }


            System.out.println(tA + " : " + teamA + " vs " + tB + " : " + teamB);
        } while ((teamA < 7) && (teamB < 7));
    }
}
