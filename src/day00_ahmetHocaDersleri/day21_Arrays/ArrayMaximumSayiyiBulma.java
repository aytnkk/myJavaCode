package day00_ahmetHocaDersleri.day21_Arrays;

public class ArrayMaximumSayiyiBulma {
    public static void main(String[] args) {

        // verilen bir Array'deki en buyuk sayiyi yazdiran bir method olusturun

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);




    }

    private static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i =1; i <sayilar.length ; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }
        System.out.println("Array'daki en buyuk sayi: " + maxSayi);


    }
}
