package day08_stringManupilations;

import java.sql.SQLOutput;
import java.util.Locale;

public class C02_toupperCaseLocale {
    public static void main(String[] args) {

        String str="JAVA CANDIR";

        System.out.println(str.toLowerCase());// java candir

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println(str);// java candIr


        str="sevgi insani hayata baglar";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));



    }
}
