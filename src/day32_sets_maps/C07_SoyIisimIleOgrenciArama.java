package day32_sets_maps;

import java.util.Map;

public class C07_SoyIisimIleOgrenciArama {

    /* ogrenci mapte aradigimiz soyisim'deki ogrencilerin ,
    isim soyisim ve sube bilgilerini bir tablo olarak yazdiran
    bir method olusturun
     */

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

         MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Can");




    }
}
