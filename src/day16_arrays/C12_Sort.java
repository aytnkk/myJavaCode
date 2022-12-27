package day16_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C12_Sort {
    public static void main(String[] args) {

        // verilen bir array'i Natural order'a gore siralayip yazdirin

        String[] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said","ahmet"};

        System.out.println(Arrays.toString(isimler));// [Huseyin, Yusuf, Mehmet, Akile, Said,ahmet]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));// [Akile, Huseyin, Mehmet, Said, Yusuf,ahmet]
        // kucuk harfle baslayan en sona gider


        // eger buyukten kucuge siralamak istersek oncce sort kullanarak natural order'a gore siralar
        // sonra gecici array kullanarak siralamayi terse ceviririz

    }
}
