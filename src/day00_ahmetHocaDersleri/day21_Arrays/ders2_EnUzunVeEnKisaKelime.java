package day00_ahmetHocaDersleri.day21_Arrays;

public class ders2_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {

        /*
        soru: verilen String bir array'de en uzun ve en kisa stringleri yazdiran bir method olusturun.

         */

        String[] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeEnKisayiYzdir(isimler);

    }

    private static void enUzunVeEnKisayiYzdir(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
               enUzunKelime=isimler[i];
            }
            if (isimler[i].length()< enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }
        }
        System.out.println("array'deki en uzun kelime:" + enUzunKelime);
        System.out.println("array'deki en kisa kelime:" + enKisaKelime);
    }
}
