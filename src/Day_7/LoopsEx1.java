package Day_7;

public class LoopsEx1 {

    public static void main(String[] args) {

        //         * Ar while cikla palīdzību
//         * uz ekrāna noprintēt skaitļus
//         * no 1 līdz 10
//                * un šo skaitļu summu.
//                * 1+2 = 3
//                * 2+3 = 5
//                * =======
//                * 1+2 = 3
//                * 3+3 = 6
//
//
        int i = 0;


//        while (i<10) {
//            System.out.println(i + "+" + i + "=" + (i + i));
//            i++;
//        }
//
//        do {
//            System.out.println(i + "+" + i + "=" + (i + i));
//            i++;
//        }while (i<10);

        for(i = 0 ; i < 10 ; i++){
            System.out.println(i + "+" + i + "=" + (i + i));
        }

    }
}
