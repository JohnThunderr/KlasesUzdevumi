package Day_5;

public class CalculatorWithSwitch {

    public static void main(String[] args) {

        // Izveidot kalkulatoru kas nejauši uzģenerē 2 float tipa mainīgos
        // random = (min + Math.random()) * (max - min);
        // Piedāvā lietotājam izvēlēties darbību ( + , - , * , / )
        // Veic attiesīgo darbību
        // Uz ekrāna noprintē izvēlētos skaitļus un rezultātu visu noapaļojot
        // līdz 3 zīmēm aiz komata

        String dbSchema =   """
            CREATE TABLE 'TEST'.'EMPLOYEE'
            (
              'ID' INT NOT "NULL" DEFAULT 0 ,
              'FIRST_NAME' VARCHAR(100) NOT NULL ,
              'LAST_NAME' VARCHAR(100) NULL ,
              'STAT_CD' TINYINT NOT NULL DEFAULT 0
            );
                 \b bacspace   """;
        System.out.println(dbSchema);
    }
}
