package genelTekrarMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hastaneDepo {
    public static void main(String[] args) {

        Map<Integer,String> aytenHastanesiMap=new HashMap<>();

        aytenHastanesiMap.put(10,"Ayten-gul-27-krd");
        aytenHastanesiMap.put(11,"Nazime-goz-37-jn");
        aytenHastanesiMap.put(12,"Miyase-an-40-goz");
        aytenHastanesiMap.put(13,"Miyase-tok-34-kbb");

        bolumYazdir(aytenHastanesiMap,"jn");
        tumListeyiYazdir(aytenHastanesiMap);
        System.out.println(isimleOlusturma(aytenHastanesiMap, "ayse"));

    }

    private static boolean isimleOlusturma(Map<Integer, String> aytenHastanesiMap, String isim) {

        Collection<String> collectionValue=aytenHastanesiMap.values();

        for (String eachValues:collectionValue) {
            String[] valueArr = eachValues.split("-");
            String valuedekiIsim=valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }
        return false;

            }






    private static void tumListeyiYazdir(Map<Integer, String> aytenHastanesiMap) {

        //Set<Map.Entry<Integer, String>> entry=aytenHastanesiMap.entrySet();

        for (Map.Entry<Integer, String>eachEntry:aytenHastanesiMap.entrySet()) {
            System.out.println(eachEntry);
        }

    }

    private static void bolumYazdir(Map<Integer, String> aytenHastanesiMap, String bolum) {

        Set<Map.Entry<Integer, String>> entry=aytenHastanesiMap.entrySet();

        for (Map.Entry<Integer, String>eachEntry:entry) {

            String entryValue=eachEntry.getValue();

            String[] valueArr = entryValue.split("-");

          // istenen bolum bilgisi getirilsin
           if (valueArr[3].equalsIgnoreCase(bolum)){
               System.out.println(eachEntry.getKey() + " " +
                       valueArr[0]+ " " +
                       valueArr[1] + " " +
                       valueArr[2]);
           }

        }


    }


}
