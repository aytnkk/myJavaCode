package day32_sets_maps.tekrar;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {


        // Numarasi verilen ogrencinin sube ismini
        // verilen sube yapan bir method olusturun

        Map<Integer, String > ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

ogrenciMap=MapMethotDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");

        System.out.println(ogrenciMap);
    }
}
