package day18_arrays.tekrar;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar); // [10, 5, 7, 9]

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement)); // true
        System.out.println(sayilar);// [10, 7, 9]


    }
}
