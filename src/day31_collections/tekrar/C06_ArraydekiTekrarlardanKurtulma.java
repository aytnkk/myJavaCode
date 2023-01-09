package day31_collections.tekrar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        /*verilen bir arraydeki tekrar eden elementleri
        sadece 1 kere yazarak arrayi kisaltan kod yazin

         */
        int[] arr = {1,2,4,2,3,5,6,2,4,5,1,2,4,5,3,2,5,6,1,2,5,4,3};

        Set<Integer> arrSet=new HashSet<>();
        // array'deki tum elementleri, Set'e ekleyelim
        for (int each: arr
             ) {
            arrSet.add(each);
            System.out.println(arrSet);


            // Set'deki element sayisina esit bir array olusturup
            // Set'deki elementleri oraya tasiyalim

            arr=new int[arrSet.size()];
            int index=0;
            for (int each1:arrSet
                 ) {
                arr[index]=each;
                index++;

            }
            System.out.println("Array'in son hali : " + Arrays.toString(arr));
        }

    }
}
