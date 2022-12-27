package day23_dateTime_varargs.tekrar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {


        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt);

              // Sadece tarihi 20/12/2022 olarak yazdiralim
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1));

        // Sadece tarihi 12.20.22 Tue seklinde yazdirin
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yy.EEE");


        // Sadece zamani  10:49 am olarak yazdirin
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("hh:mm a");


    }
}
