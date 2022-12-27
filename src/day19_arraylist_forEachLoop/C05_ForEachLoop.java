package day19_arraylist_forEachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {

       // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer[] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (!list1.contains(each)){
                list1.add(each);

            }
        }
        // list olarak unique degerlerden olusan bir list olusturduk

        arr=new Integer[list1.size()];

        // simdi listteki elementleri arraye kopyaliyalim
        // arraye atama yapmak icin indexe ihtiyacimiz
        // oldugundan for each loop kullanmak pratik degildir

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= list1.get(i);
        }
        System.out.println("Arrayin yeni hali: " + Arrays.toString(arr));

    }
}
