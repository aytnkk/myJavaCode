package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {

    public static void main(String[] args) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran bir method olusturun


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Berivan-Gokkaya-11-M-TM");

        MapMethodDepo.IsimSoyisimSiraliListeYazdir(ogrenciMap);
        /*
       isim soyisim no sinif sube bolum
       ================
       Ali    CAN    101  11    H    MF
       Ali    CEM    103  11    K    TM
       Ayse   CAN    104  10    H    MF
       Sevgi  CAN    106  10    K    MF
       Sevgi  CEM    105  11    M    TM
       Veli   CEM    102  10    K    TM

         */
    }
}
