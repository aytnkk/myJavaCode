package day16_arrays;

import java.util.Arrays;

public class C03_elemetleriBesArtrirmaSoru {
    public static void main(String[] args) {


        // verilen bir int Arraydaki tum elementleri 5 arttirin

        int [] arr={2,4,6,8};

        for (int i = 0; i < arr.length ; i++) {
            arr[i] +=5;

        }

        System.out.println(Arrays.toString(arr));//[7, 9, 11, 13]


    }
}
