package Day_12;

import Day_14.Methods;

import java.util.*;

public class ArrayListExercise {
    public static void main(String[] args) {
        /*1)Izveidot tukšu sarakstu (arrayList).
         Sarakstam pievienot piecus String tipa elementus
         (piemēram krāsas, mašīnas, augļus vai ko citu).
         Izprintēt sarakstu uz ekrāna vienā rindā.
         //Pievienot saraksta sākumā un vidū pa vienam papildu elementam.
         Izprintēt sarakstu stabiņā uz leju.
         Izņemt ceturto elementu no saraksta.
        ArrayList<String> listExample = new ArrayList<>();

        System.out.println(listExample);
        listExample.add("red");
        listExample.add("green");
        listExample.add("blue");
        listExample.add("grey");
        listExample.add("bronze");

        System.out.println(listExample);
        // 5 / 2 = 2
        listExample.add(0,"pink");
        listExample.add(listExample.size() / 2,"purple");

        System.out.println(listExample);

        // izmanto saraksta garumu

        for(int i = 0; i < listExample.size(); i++){
            System.out.println(listExample.get(i)); //izmanto .get() šeit
        }

        //.remove()
        listExample.remove(3);
        System.out.println(listExample);




        //2)Izveidot programmu, kas no lietotāja pieprasa ievadi.
        // String formā šo ievadi saglabā sarakstā un turpina prasīt ievadi,
        // līdz lietotājs ievada "exit". Izvada visu sarakstu uz ekrāna stabiņā uz leju.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lisOfStrings = new ArrayList<>();
        System.out.println("Aizpildiet sarakstu ar ierakstiem: ");
        String userIn = "";
        while(!userIn.equalsIgnoreCase("exit")){
            userIn = sc.nextLine();
            if(!userIn.equalsIgnoreCase("exit"))
                lisOfStrings.add(userIn);
        }
        System.out.println(lisOfStrings);

        System.out.printf("Jūsu sarakstā ir %d elementi:", lisOfStrings.size());
        for (element : lisOfStrings){

*/

        //3)Random izmēra saraksts, kas glabās integer tipa vērtības (minimum size = 8).
        //Visas vērtības sarakstā arī random generated.
        //Izdzēst visas vērtības sarakstā kas lielākas par 40 && mazākas par 60.
        // Precīzi saraksta vidū ievietot visas vērtības no 1 līdz 9.
        // [11, 22, 1,2,3,4,5,6,7,8,9, 33, 44 ]
        Random r = new Random();
        ArrayList<Integer> intList = new ArrayList<>();
        List<Integer> intListCopy;

        for(int i = 0; i < r.nextInt(8,20); i++){
            intList.add(r.nextInt(100));
        }
        System.out.println(intList);
        intListCopy = new ArrayList<>(intList);

        for(int i = 0; i < intListCopy.size() ; i++){
            if((intListCopy.get(i) > 40) && (intListCopy.get(i) < 60)){
                intList.remove(i);
            }
        }
        System.out.println(intList);
    }
}
