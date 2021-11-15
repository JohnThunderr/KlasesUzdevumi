package Day_11;

import java.util.Scanner;

public class Parse_TryCatch {

    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String n = "323";
        int z = Integer.parseInt(n);

        int cvb = sc.nextInt();
        System.out.println(z);
        System.out.println("Ja viss labi, noprintē šo rindu");
        // Syntax / Runtime error / Loģiskie vai Bugs
    }
    catch(ArrayIndexOutOfBoundsException e1){System.out.println(2);}
    catch(NumberFormatException e2){System.out.println(1);}
    catch(ArithmeticException e3){System.out.println(3);}
    catch(IllegalStateException e4){System.out.println(4);}



    }
}
