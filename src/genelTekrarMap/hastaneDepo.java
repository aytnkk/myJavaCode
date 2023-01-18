package genelTekrarMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hastaneDepo {
    public static void main(String[] args) {

        Map<Integer,String> aytenHastanesiMap=new HashMap<>();

        aytenHastanesiMap.put(10,"Ayten-gul-27-krd");
        aytenHastanesiMap.put(11,"Nazime-goz-37-jn");
        aytenHastanesiMap.put(12,"Miyase-an-40-goz");

        System.out.println(aytenHastanesiMap.containsKey(10));
        System.out.println(aytenHastanesiMap.get(10));

        keySirala(aytenHastanesiMap);
    }

    private static void keySirala(Map<Integer, String> aytenHastanesiMap) {

        Set<Map.Entry<Integer, String>> entry=aytenHastanesiMap.entrySet();
        for (Map.Entry<Integer, String>eachEntry:entry) {

            String entryValue=eachEntry.getValue();

            String[] valueArr = entryValue.split("-");



        }

    }


}
