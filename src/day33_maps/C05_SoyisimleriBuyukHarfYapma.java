package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {
    public static void main(String[] args) {

        // mapteki soyisimleri buyuk harfe cevuren bir method olusturun


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.soyIisimleriBuyukHarfYapma(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

        // 11.siniflari yazdir

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");

    }
}
