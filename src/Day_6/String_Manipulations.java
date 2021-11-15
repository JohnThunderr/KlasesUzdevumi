package Day_6;

import java.util.*;

public class String_Manipulations {

    public static void main(String[] args) {

//        Random r = new Random();
//
//            //Nejauši izvēlamies 3 simbolus no unicode
//        char c1 = (char)r.nextInt(65,91);
//        char c2 = (char)r.nextInt(65,91);
//        char c3 = (char)r.nextInt(65,91);
//
//            //Mēģinam salikt tos kopā
//        System.out.println(c1+c2+c3);
//
//            //Saliekam kopā, lai izveidotu tekstuālu vērtību
//        String text = ""+c1+c2+c3;
//        System.out.println(text);
//
//            //.charAt(index) atgreiž simbolu no teksta norādītajā vietā
//        String text = "abcde";
//        char getChar = text.charAt(1);
//        System.out.println(getChar);

//            //Contains/Satur => true/false jautājums
//        String name = "Janis";
//        String nAme = "JANis";
//
//        System.out.println(name.contains("an"));
//        System.out.println(name.contains(nAme));
//
//            //Vienāds
//        String s1 = "abc";
//        CharSequence s2 = "abc";
//
////        System.out.println(s1 == s2);  //Šajā versijā Java saprot vienādību un šis strāda
////        // bet vecākās versijās ne, jo tiek salīdzinātas texta adreses atmiņā
//
//        //System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.contentEquals(s2)); //Salīdzina String ar citiem tipiem (StringBuilder, a StringBuffer, a CharSequence)

            //Format
//        String str2 = String.format("Some text here |%10d|", 101);  // Specifying length of integer
//        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
//        String str4 = String.format("%.03f", 101.123456);       // Float value
//
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//
//        Calendar c = Calendar.getInstance();
//        System.out.println("Current Date and Time :");
//        System.out.format("%te %tB, %tY%n", c, c, c);
//        System.out.format("%tk:%tM ", c, c);


//
//            //index
//        String t = "Text here 1";
//        System.out.println(t.indexOf('e',3));
//        System.out.println(t.indexOf("Tex",3));
//        System.out.println(t.indexOf("HER"));
//
            //pārbaude uz tukšumu. Atgriež true/false
//        String empty = "      ";
//        System.out.println(empty.isBlank()); //pieļauj whitespace
//        System.out.println(empty.isEmpty()); //true tikai tad, kad .length() atgriež 0
//
//            //izmērs/garums
//        String str = "AbcAbc";
////        System.out.println(str.length()); //atgriež simbolu patieso daudzumu, nevis last index of string
////
////            //aizvietošana
//        System.out.println(str.replace('c','d')); //Case sensitive
//        System.out.println(str.replace("bc","def")); //Case sensitive
//        System.out.println(str.replaceFirst("bcds","def")); //Case sensitive
////        .replaceALl("koMeklējam", "arKoAizvietojam")
//
//            //Daļa no teksta
//        String sub = str.substring(1, 3);
//        System.out.println(sub);
//
            //
//        String str2 = "AAA bbb CcC";
//        System.out.println(str2.toLowerCase());
//        System.out.println(str2.toLowerCase(Locale.GERMAN));
//        System.out.println(str2.toUpperCase());
//
//            //Trim
//        String str3 = "       abc          def      ";
//        System.out.println(str3);
//        System.out.println(str3.trim());




        //.charAt() Vingrinājums
        //Dots teksta gabals "Java Vingrinājums!"
        //Uz ekrāna izvadīt pirmo on desmito simbolu no teksta

//        String str = "Java Vingrinājums!";
//        System.out.println("Sākotnējais Teksts = " + str);
//        // Get the character at positions 1 and 10.
//        int index1 = str.charAt(0);
//        int index2 = str.charAt(9);
//        char secondChar = str.charAt(9);
//
//        // Print out the results.
//        System.out.println("Simbols pozīcijā 1 ir " +
//                (char)index1);
//        System.out.println("Simbols pozīcijā 10 ir " +
//                secondChar);



        //.contains() vingrinājums
        //Dots teksts
        // "Visi diktāta dalībnieki norādītajā e-pastā ir saņēmuši izlaboto darbu un īpašu apliecinājumu par piedalīšanos, savukārt 18 labāko rezultātu ieguvēji decembra laikā tika apbalvoti ar vērtīgām grāmatām no uzņēmuma „Jāņa Rozes grāmatnīca”.
        //
        //Aptuveni 300 vārdu garo tekstu „Pasaka par vārdu tapšanu” īpaši šim nolūkam radīja dzejnieks, publicists un tulkotājs Ilmārs Šlāpins. To Rīgā – Gaismas pilī – diktēja Aktrise un runas pedagoģe Zane Daudziņa. Teksta atbilstību latviešu valodas normām pārbaudīja un apstiprināja Latvijas Universitātes Humanitāro zinātņu fakultātes Latvistikas un baltistikas nodaļas profesore Andra Kalnača.
        //
        //2020. gadā Pasaules diktātu latviešu valodā rakstīja 2675 dalībnieki, 2019. gadā – 2042 dalībnieki, 2018. gadā – 1657 dalībnieki, 2017. gadā – 935 dalībnieki, 2016. gadā – 789 dalībnieki, 2015. gadā – 920 dalībnieki."
        //Noprintēt visu tekstu uz ekrāna pārlasāmā formā
        //pārbaudīt vai tekstā atrodami šādi elementi:
        //"Aktrise" , "scenārijs" , "nodaļa" , "trauksme" , "Dalībnieks"

//        //Hint: \n vai """ text here """
//        String str1 = """
//        Visi diktāta dalībnieki norādītajā e-pastā ir saņēmuši izlaboto darbu un īpašu
//        par piedalīšanos, savukārt 18 labāko rezultātu ieguvēji decembra laikā tika apbalvoti
//        ar vērtīgām grāmatām no uzņēmuma „Jāņa Rozes grāmatnīca”.
//
//        Aptuveni 300 vārdu garo tekstu „Pasaka par vārdu tapšanu” īpaši šim nolūkam radīja
//        dzejnieks, publicists un tulkotājs Ilmārs Šlāpins. To Rīgā – Gaismas pilī – diktēja
//        Aktrise un runas pedagoģe Zane Daudziņa. Teksta atbilstību latviešu valodas normām
//        pārbaudīja un apstiprināja Latvijas Universitātes Humanitāro zinātņu fakultātes
//        Latvistikas un baltistikas nodaļas profesore Andra Kalnača.
//
//        2020. gadā Pasaules diktātu latviešu valodā rakstīja 2675 dalībnieki,
//        2019. gadā – 2042 dalībnieki, 2018. gadā – 1657 dalībnieki, 2017. gadā – 935 dalībnieki,
//        2016. gadā – 789 dalībnieki, 2015. gadā – 920 dalībnieki.
//                """;
//        String str2 = "Aktrise";
//        String str3 = "scenārijs";
//        String str4 = "nodaļa";
//        String str5 = "trauksme";
//        String str6 = "Dalībnieks";
//
//
//        System.out.println("Original String: " + str1);
//        System.out.println("Specified sequence of char values: " + str2 +
//                " " + str3 + " " + str4 + " " + str5 + " " + str6);
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.contains(str3));
//        System.out.println(str1.contains(str4));
//        System.out.println(str1.contains(str5));
//        System.out.println(str1.contains(str6));




        //.equals()
        // Doti divi Stringi un viens CharSequence
        //Salīdzīnāt katru Stringu ar charSequence un noskaidrot vai tie ir vienādi
        //Salīdzināt abus string savā starpā (gan orģinālo versoju, gan pēc satura būtības
//        String str1 = "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html",
//               str2 = "Https://docs.oracle.com/en/java/javase/11/docs/api/java.base/Java/lang/String.html";
//        CharSequence cs = "https://docs.oracle.com/en/java/javase/11/Docs/api/java.base/java/lang/String.html";
//        System.out.println("Comparing "+str1+"\nand "+cs+": " + str1.contentEquals(cs));
//        System.out.println("Comparing "+str2+"\nand "+cs+": " + str2.contentEquals(cs));
//        System.out.println("Comparing "+str2+"\nand "+str1+": " + str2.equalsIgnoreCase(str1));

        //length
        //Izveidot programmu kas atgriež Stringa garumu
        //Šo garumu pareizināt ar 678
        //pārvērst par simbolu no unicode
        //noprintēt uz ekrāna gan stringa garumu, gan simbolu
        //String str = "example.com";
        // Get the length of str.
//        int len = str.length();
//        System.out.println("The string length of '"+str+"' is: "+len);
//        char c = (char)(len * 678);
//        System.out.println(c);

        //Replace
        //Ņemam standarta stringu "Nory was a Catholic because her mother was a Catholic, and Nory’s mother was a Catholic because her father was a Catholic, and her father was a Catholic because his mother was a Catholic, or had been"
        //un katru "Catholic" aizvietojam ar "Faithless person"
        //Papildu uz ekrāna atgriezt substring starp 30 un 50 simbolu indexu
//        String str = "Nory was a Catholic because her mother was a Catholic, and Nory’s mother was a Catholic because " +
//                "her father was a Catholic, and her father was a Catholic because his mother was a Catholic, or had been" ;
//
//        String new_str = str.replace("Catholic", "faithless person");
//
//        // Display the strings for comparison.
//        System.out.println("Original string: " + str);
//        System.out.println("New String: " + new_str);
//        String new_str2 = str.substring(30, 50);
//        System.out.println(new_str2.length());

        //Lowe un Upper Case
        //Pārveidot doto string uz lower un upper case
        //izvadīt oriģinālo un jauniegūtās vērtības uz ekrāna
        //"The Quick BroWn FoX! "

        //"     Java Excercise                                                               "
        //Nodzēšam liekās atstarpes

        /**
         * Uzrakstīt programmu klasē ar nosaukumu "HelloUser", kas
         * 1) "Vārds Uzvārds"
         * 2) Sadala vārdu un uzvārdu divos mainīgajos.
         * 3) Vārdu pārveido tā, lai tas sāktos ar lielo burtu un visi pārējie būtu mazie burti (Piemēram, "Kristaps")
         * 4) Uzvārdu pārveido, lai tas viss sastāvētu no lielajiem burtiem (Piemēram, "KRŪMIŅŠ")
         * 5) Izvada uz ekrāna pārveidoto vārdu un uzvārdu, katru savā rindiņā ievietotu single
         * quote pēdiņās(')
         */

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next(), surname = sc.nextLine();

//        String str = " vārds uzvārds          ";
//        str = str.trim();
//        int lastIndexOfName = str.indexOf(' ');
//        String name = str.substring(0,lastIndexOfName);
//        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//        String surname = str.substring(lastIndexOfName + 1);
//        surname = surname.toUpperCase();
//
//        name = String.format("\'%s\'",name);
//        surname = String.format("\n\'%s\'",surname);
//        System.out.println(name + surname);

                Scanner sc = new Scanner(System.in);

                System.out.println("Ievadiet X:");
                int x = sc.nextInt();

                System.out.println("Ievadiet Y:");
                int y = sc.nextInt();

                if((x > -2 && x < 3) && (y > -4 && y <1)) {
                    System.out.println("Koordinātas (x;y) atrodas figūras iekšienē!");

                } else if ((x == -2 || x == 3) && (y == -4 || y == 1)) {
                    System.out.println("Koordinātas (x;y) atrodas uz figūras līnijas!");

                } else {
                    System.out.println("Koordinātas (x;y) atrodas figūras ārpusē!");
                }

    }
}
