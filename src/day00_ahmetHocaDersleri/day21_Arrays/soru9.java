package day00_ahmetHocaDersleri.day21_Arrays;

public class soru9 {
    public static void main(String[] args) {


        /*Soru 9- Verilen String bir array’deki en uzun ve en kisa kelimeleri ,
        yazdiran bir method olusturun

         */

        String[] isimler={"Nurullah","Mehmet","Ayse","Veli"};

        enUzunEnKisaKelimeYazdir(isimler);


    }

    private static void enUzunEnKisaKelimeYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];


        for (int i = 1; i < isimler.length; i++) {
           if (isimler[i].length()>enUzunKelime.length()){
               enKisaKelime=isimler[i];

            }
           if (isimler[i].length()<enKisaKelime.length()){
               enKisaKelime=isimler[i];
           }
        }

        System.out.println("array'deki en uzun kelime :" +enUzunKelime );
        System.out.println("array'deki en kisa kelime :" +enKisaKelime);
    }
}
