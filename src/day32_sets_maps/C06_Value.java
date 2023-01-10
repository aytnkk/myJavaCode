package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        // mapOlustur methodu bize bir map donduruyor
        //biz o class'daki map'i kullanmak istiyoruz
        // her seferinde o classa gidip o map'i yeniden olusturmamiz isimize yaramaz

        // Bu classda bir map olusturmak  istedigimizde
        // new HasMap() yaziyoruz
        // ancak bu bize bos bir map getiriyor
        // bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur methodunu calistirirsak bize dolu bir map getirir
        // bizde onu icinde oldugumuz class'da olusturdugumuz ogrencimap'e atama yapariz

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Cemal-Han-12-M-MF}


        System.out.println(ogrenciMap.keySet());
        //[101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        // verilen ismin ogrencimapte olup olmadigini kontrol edip true veya false donen bir method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");

        System.out.println(sonuc); //true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Kemal"));//false



    }
}
