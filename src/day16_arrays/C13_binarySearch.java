package day16_arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {

        // binary tree java'nin kullandigi ozel bir siralama yontemidir
        // binarysearch methodu binaryTree ozelligini kullandigindan
        // sirali olmayan array'lerde digru sonuc dondurmeyebilir
        // eger binarySearch() kullanilicaksa
        // oncesinde mutlaka sort() kullanilmalidir
        int[] arr={2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 3)); //3





    }
}
