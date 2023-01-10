package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Arrays;

public class stringmetninoktalardankurtarma {
    public static void main(String[] args) {

        String cumle="hava cok guzel.ama ben cok yanlizim.bu yuzden depresyondayim";

        String[] metin=cumle.split("\\."); // ters slas koymazsak java cumleleri tek bir cumle halinde gorur

        System.out.println(metin.length);//3

        System.out.println(Arrays.toString(metin));//[hava cok guzel, ama ben cok yanlizim, bu yuzden depresyondayim]

    }
}
