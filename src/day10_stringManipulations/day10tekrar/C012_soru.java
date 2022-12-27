package day10_stringManipulations.day10tekrar;

public class C012_soru {
    public static void main(String[] args) {
     /*
     kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip ,
     sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yaziniz

     input:java1 ogRe2@nMek3 #ne +Gu=zel
      output=Java ogrenmek ne guzel.

     */

       String input="java1 ogRe2@nMek3 #ne +Gu=zel";

        input=input.replaceAll("\\d","");
        System.out.println(input);


        input=input.replaceAll("\\W","");

        input=input.replaceFirst("j","J");

        System.out.print(input);


        System.out.println("****************************");



        // buradaki harf sayisini bulun
        String input3="Ali Can,Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());//22
    }
}
