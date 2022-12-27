package day00_ahmetHocaDersleri.day21_Arrays;

public class isimSoyisimBuyukYazma {
    public static void main(String[] args) {

        /* Soru 4 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
    yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
    harflerle yazdirin.

         */

        String isim = "turku";
        String soyIsim = "cal";


        if (isim.length() > soyIsim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1)
                    + " " + soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));


        } else {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) +
                    " " + soyIsim.toUpperCase());
        }


    }
    }

