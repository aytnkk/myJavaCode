package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Arrays;

public class C05_yeniElementEkleme {
    public static void main(String[] args) {
        /*
        Verilen bir Arraye yeni birn element ekleyen bir method olusturun

         */

        String[] sinifListesi={"Ali Can"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    private static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yeniSinifListesi=new String[sinifListesi.length+1];
        // eski listeden bir eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i < sinifListesi.length; i++) {
          yeniSinifListesi[i]=sinifListesi[i];

        }// oncelikle eski listedeki tum elemanlari ,yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
       // son indexe ise eklenecek ismi atadim.

        return yeniSinifListesi;
    }
}
