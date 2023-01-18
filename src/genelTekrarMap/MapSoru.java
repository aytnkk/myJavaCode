package genelTekrarMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSoru {

    /*
    verilen bir cumlede kullanilan her bir harfi ve kacar kez
    kullanildigini yazdirin.
    ornek:Java candir
    output:J=1, a=3, v=1,c=1,n=1,d=1,i=1,r=1

     */
    public static void main(String[] args) {

        String cumle = "Ayten cok tembel";

        Map<String, Integer> aytenMap = new HashMap<>();

        cumle = cumle.replaceAll("\\W", "");
        String[] arr = cumle.split("");


        for (String each : arr) {
            if (!aytenMap.containsKey(each)) {
                aytenMap.put(each, 1);
            } else {
                int eskiValue = aytenMap.get(each);
                aytenMap.put(each, eskiValue + 1);
            }

        }
        System.out.println(aytenMap);


        Map<String, Integer> aytenMap2 = new HashMap<>();
        for (String each : arr) {

            aytenMap2.computeIfPresent(each,(k,v)-> v+1);
            aytenMap2.computeIfAbsent(each, v-> 1);
        }

        System.out.println("aytenMap2 :" + aytenMap2);
    }

}