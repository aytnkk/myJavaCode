package day17_arrays.tekrar;

import java.util.Arrays;

public class C04_MultiDimmensionalArrays {
    public static void main(String[] args) {


        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);// 5

        System.out.println(arr[2].length);// 4  3.uncu indexteki parantezin icindeki karakter sayisi

        System.out.println(arr[2][1]);// 2 elementin birinci indexteki sayisi  7

        System.out.println(arr[3]);//[I@4dd8dc3

// multi deimensional array ile calisirken dikkat etmemiz gereken en onemli konu
        // yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi dondurdugudur

        System.out.println(Arrays.toString(arr[3]));// [2]
        // 21.satirdaki 2 elemntini yazdirmak istersek
        System.out.println(arr[3][0]);// 2

        // multi dimmensionalin tamamini yazdirmak isterseniz
        // tek katli arrayleri yazdirmak icin kullandigimiz yontem yeterli olmaz

        System.out.println(Arrays.toString(arr));// [[I@6d03e736, [I@568db2f2, [I@378bf509, [I@4dd8dc3, [I@5fd0d5ae]
        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4, 5], [6, 7, 4, 5]
    }
}
