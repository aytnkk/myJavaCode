package day10_stringManipulations.day10tekrar;

public class C05_Sorular {

    public static void main(String[] args) {

             /*
        Soru 1 : Kullanicidan bir cumle alin
  - cumlede ev geciyorsa, “home home sweet home” yazdirin
  - cumlede is geciyorsa, “calismak guzeldir”
  - ikisini de iceriyorsa “Hem ev lazim hem is”
  - hicbirini icermiyorsa “cok calisman lazim” yazdirin

         */


        String str = "evden calisiyorum, ofise gitmeye gerek yok";
        String calisilacakStr = str.toLowerCase();

        if (calisilacakStr.contains("ev") && calisilacakStr.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (calisilacakStr.contains("is")) {
            System.out.println("calismak guzeldir");

        } else {
            System.out.println("cok calisman lazim");


        }
    }
}