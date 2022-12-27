package day23_dateTime_varargs.tekrar;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));

        System.out.println(ldt);
        ldt=LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.withYear(2030));
    }
}
