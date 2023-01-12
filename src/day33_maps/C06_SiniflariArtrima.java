package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtrima {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArrtir(ogrenciMap);

       MapMethodDepo.tumListeYazdir(ogrenciMap);

    }
}
