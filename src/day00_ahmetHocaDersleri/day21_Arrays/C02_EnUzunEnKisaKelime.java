package day00_ahmetHocaDersleri.day21_Arrays;

public class C02_EnUzunEnKisaKelime {
    public static void main(String[] args) {

        /*
        Verilen string bir arrayde ,en uzun ve en kisa stringleri yazdiran bir method olusturun

         */
        String[] isimler={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        EnUzunEnKisayiYazdir(isimler);
    }

    private static void EnUzunEnKisayiYazdir(String[] isimler) {
        String  enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }
        }
        System.out.println("Array'deki en uzun kelime: " + enUzunKelime);
        System.out.println("Array'deki en kisa kelime:"+ enKisaKelime);


    }
}
