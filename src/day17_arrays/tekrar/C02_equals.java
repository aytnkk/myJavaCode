package day17_arrays.tekrar;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {

        int[] arr1={3, 8, 0};
        int[] arr2={8, 3, 0};

        System.out.println(Arrays.equals(arr1, arr2));//false

        // equals methodu hem elementlertleri hem de indexleri kontrol eder
        // ayni indexlerde ayni elementleri varsa true, yoksa false doner

        // eger siralamdan dolayi false donmesini istemiyorsak
        // once iki arrayi de sort yapabiliriz

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));// true

    }
}
