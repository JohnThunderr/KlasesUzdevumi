package Day_9;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;
        String[] names = new String[200];
        for(int i = 1; i == 1 ; i++) {
            String n = "James Mary Robert Patricia John Jennifer Michael Linda William Elizabeth" +
                    " David Barbara Richard Susan Joseph Jessica Thomas Sarah Charles Karen" +
                    "Christopher Nancy Daniel Lisa Matthew Betty Anthony Margaret Mark Sandra" +
                    "Donald\t    \tAshley\t\n" +
                    "Steven\t    \tKimberly\n" +
                    "Paul\t    \tEmily\t\n" +
                    "Andrew\t    \tDonna\t\n" +
                    "Joshua\t    \tMichelle\n" +
                    "Kenneth\t    \tDorothy\t\n" +
                    "Kevin\t    \tCarol\t\n" +
                    "Brian\t    \tAmanda\t\n" +
                    "George\t    \tMelissa\t\n" +
                    "Edward\t    \tDeborah\t\n" +
                    "Ronald\t    \tStephanie\n" +
                    "Timothy\t    \tRebecca\t\n" +
                    "Jason\t    \tSharon\t\n" +
                    "Jeffrey \t    Laura\t\n" +
                    "Ryan\t    \tCynthia\t\n" +
                    "Jacob\t    \tKathleen\n" +
                    "Gary\t    \tAmy\t\n" +
                    "Nicholas\t   \tShirley\t\n" +
                    "Eric\t    \tAngela\t\n" +
                    "Jonathan\t   \tHelen\t\n" +
                    "Stephen\t    \tAnna\t\n" +
                    "Larry\t    \tBrenda\t\n" +
                    "Justin\t    \tPamela\t\n" +
                    "Scott\t    \tNicole\t\n" +
                    "Brandon\t    \tEmma\t\n" +
                    "Benjamin    \tSamantha\n" +
                    "Samuel\t         Katherine\n" +
                    "Gregory\t         Christine\n" +
                    "Frank\t         Debra\t\n" +
                    "Alexande    \tRachel\t\n" +
                    "Raymond\t    \tCatherine\t\n" +
                    "Patrick\t    \tCarolyn\n" +
                    "Jack\t    \tJanet\t\n" +
                    "Dennis\t    \tRuth\t\n" +
                    "Jerry\t    \tMaria\t\n" +
                    "Tyler\t    \tHeather\n" +
                    "Aaron\t    \tDiane\t\n" +
                    "Jose\t    \tVirginia\t\n" +
                    "Adam\t    \tJulie\t\n" +
                    "Henry\t    \tJoyce\t\n" +
                    "Nathan\t    \tVictoria\n" +
                    "Douglas\t    \tOlivia\t\n" +
                    "Zachary\t    \tKelly\t\n" +
                    "Peter\t    \tChristina\n" +
                    "Kyle\t    \tLauren\t\n" +
                    "Walter\t    \tJoan\t\n" +
                    "Ethan\t    \tEvelyn\t\n" +
                    "Jeremy\t    \tJudith\t\n" +
                    "Harold\t    \tMegan\t\n" +
                    "Keith\t    \tCheryl\t\n" +
                    "Christia    \tAndrea\t\n" +
                    "Roger\t    \tHannah\t\n" +
                    "Noah\t    \tMartha\t\n" +
                    "Gerald\t    \tJacqueline\n" +
                    "Carl\t    \tFrances\n" +
                    "Terry\t    \tGloria\n" +
                    "Sean\t    \tAnn\n" +
                    "Austin\t    \tTeresa\t\n" +
                    "Arthur\t    \tKathryn\t\n" +
                    "Lawrence       \tSara\t\n" +
                    "Jesse\t    \tJanice\t\n" +
                    "Dylan\t    \tJean\t\n" +
                    "Bryan\t    \tAlice\t\n" +
                    "Joe\t            Madison\t\n" +
                    "Jordan\t        Doris\t\n" +
                    "Billy\t        Abigail\t\n" +
                    "Bruce\t        Julia\t\n" +
                    "Albert\t        Judy\t\n" +
                    "Willie\t        Grace\t\n" +
                    "Gabriel\t        Denise\t\n" +
                    "Logan\t        Amber\t\n" +
                    "Alan\t        Marilyn\t\n" +
                    "Juan\t        Beverly\t\n" +
                    "Wayne\t        Danielle\n" +
                    "Roy\t        \tTheresa\t\n" +
                    "Ralph\t    \tSophia\t\n" +
                    "Randy\t    \tMarie\t\n" +
                    "Eugene\t    \tDiana\t\n" +
                    "Vincent\t    \tBrittany\n" +
                    "Russell\t    \tNatalie\t\n" +
                    "Elijah\t    \tIsabella\n" +
                    "Louis\t    \tCharlotte\n" +
                    "Bobby\t    \tRose\t\n" +
                    "Philip\t    \tAlexis\t\n" +
                    "Johnny\t    \tKayla\t";

//            names = n.split("\\s+");
//            System.out.println(Arrays.toString(names));
            String[] arrOfStr = n.split(" +");
            for (String a : arrOfStr)
                System.out.println(a);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Meklet: ");
            String searchBy = scanner.next();
            scanner.close();
            for (String name : arrOfStr) {
                if (name.toUpperCase().startsWith(searchBy.trim().toUpperCase())) {
                    System.out.println(name);
                }
            }        }

        System.out.println("Ko meklēsim sarakstā: ");
        userInput = sc.nextLine();
//        for(int i = 0; i < names.length; i++){
//            if(names[i].toUpperCase().startsWith(userInput.toUpperCase()))
//                System.out.println(names[i]);
//        }
        for(int i = 0; i < names.length; i++){
            if(names[i].toUpperCase().contains(userInput.toUpperCase()))
                System.out.println(names[i]);
        }

/**
 * Sadalīt šo stringu pa elementiem ( Vārdiem) un ievietot masīvā.
 * No lietotāja pieprasam kaut kādu simbolu kopumu.
 * 1) Atrast Vai Masīvā ir elementi kas sākas ar userInput
 * 2) Vai masīvā ir elementi, kas satur userInput
 */


    }
}
