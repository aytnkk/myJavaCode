package day17_arrays.tekrar;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";

        // str'da kac kelime var?
        // split methodu istedigimiz String'i istedigimiz ayirac kullanarak
        // parcalara ayirmamiza imkan verir

        String[] spaceSplit=str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));
        System.out.println("verilen cumledeki kelime sayisi  :" + spaceSplit.length);

        System.out.println(Arrays.toString(str.split("gun")));// [Java her gecen ,  guzellesiyor]
        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]
    }
}
