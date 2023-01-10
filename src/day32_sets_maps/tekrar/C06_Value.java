package day32_sets_maps.tekrar;

import day32_sets_maps.MapMethodDepo;

import java.sql.SQLOutput;
import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {


    Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

      ogrenciMap.put(120,"Cemal-Han-13-M-MF");
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());

        System.out.println(ogrenciMap.values());

        boolean sonuc=MapMethotDepo.ogrenciIsmiIleArama(ogrenciMap,"Ali");
        System.out.println(sonuc);

    }
}
