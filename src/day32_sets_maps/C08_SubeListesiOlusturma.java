package day32_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {

        // verilen sube ve sinif ismi ile sinif listesini yazdiran method olusturun


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesYazdrima(ogrenciMap,"11","H");




    }
}
