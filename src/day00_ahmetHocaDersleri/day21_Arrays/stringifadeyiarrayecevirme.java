package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Arrays;

public class stringifadeyiarrayecevirme {
    public static void main(String[] args) {

        String isimler="ayse,fatma,hayriye,gel,beriye,beriye";

        // srting i arraye donustrumek icin yeni bir array olusturup stringi icine atamaliyiz

        String[] arr=isimler.split(",");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr.length);//6
    }
}
