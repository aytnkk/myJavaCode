package day09_stringManipuations.day09_tekrar;

import javax.crypto.spec.PSource;

public class C10_sorular2 {
    public static void main(String[] args) {

        /*
        soru 2= kullanicidan bir Strimng ve aranacak metin alin .
        Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.


        -String aranan metni icermiyor
        -aranan metin String'de sadece bir kere kullanilmis
        -Aranan metin Strinde 1'den fazla kullanilmis
         */

        String girilenMetin="Java'yla her sey harika";
        String aranacakMetin="harika ";

        int ilkHarikaIndexi=girilenMetin.indexOf("harika");
        int sonHarikaIndexi=girilenMetin.lastIndexOf("harika");

        if (!girilenMetin.contains(aranacakMetin)){
            System.out.println("String aranan metni icermiyor");
        } else if (ilkHarikaIndexi==sonHarikaIndexi) {
            System.out.println("aranan metin String'de sadece bir kere kullanilmis");

        } else  {
            System.out.println("Aranan metin Strinde 1'den fazla kullanilmis");

        }


    }
}
