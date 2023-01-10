package day32_sets_maps.tekrar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethotDepo {


    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;


    }


    public static boolean ogrenciIsmiIleArama(Map<Integer, String> ogrenciMap, String isim) {

        Collection<String> valuesCollection = ogrenciMap.values();

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIisim = valueArr[0];

            if (valuedekiIisim.equalsIgnoreCase(isim)) {
                return true;
            }

        }
        return false;

    }

    public static void soyIisimIleOgrenciArama(Map<Integer, String> ogrenciMap, String soyisim) {

        Collection<String> ogrenciValuesCollection = ogrenciMap.values();
        System.out.println("isim soyisim sinif sube");

        for (String eachValue : ogrenciValuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueaSoyIsim = valueArr[1];

            if (valueaSoyIsim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " "
                        + valueArr[1] + " "
                        + valueArr[2] + " "
                        + valueArr[3] + " ");
            }

        }

    }

    public static void subeListesiIleOlusturma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("isim  soyisim");

        for (String eachValue : valueCollection
        ) {
            String[] valueArr = eachValue.split("-");// [Ali, Can, 11, H, MF]

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }

        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {


        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz
        String ogrenciValue = ogrenciMap.get(okulNo);
        String[] valueArr = ogrenciValue.split("-");
        // 2- sube ismini guncelleyelim

        valueArr[3] = yeniSubeIsmi;

        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;


    }
}