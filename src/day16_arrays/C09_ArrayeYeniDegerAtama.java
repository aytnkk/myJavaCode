package day16_arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1={1,2,3};

       // arr1={1,2,3,4,5};
       // arr1={5,7,1};

       // arr1=new int[5];

        System.out.println(Arrays.toString(arr1));//

        // 14.satirdaki atama ile java arr1'in pointerini eski arrayden silip
        // new keyword'u ile olusturdugumuz yeni arra'e yonlendirir

        // eski elementleri de korumak istersek ne yapmaliyiz?
        // a zaman atama yapmadan once yeni arrray'i hazirlamaliyiz
        // bunun icin bos bir yeni array olusturup
        // eski arraydeki elemnetleri yeni arraye tasiyip
        //sonra atamayi yapabiliriz

        int[] temp= new int[5];

        for (int i = 0; i < arr1.length ; i++) {
            temp[i]=arr1[i];
        }

        System.out.println(Arrays.toString(arr1));// [1, 2, 3]
        System.out.println(Arrays.toString(temp));// [1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]
    }
}
