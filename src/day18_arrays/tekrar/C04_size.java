package day18_arrays.tekrar;

import java.util.ArrayList;
import java.util.List;

public class C04_size {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);
        System.out.println(sayilar.size());//4 lenght mantigi
        System.out.println(sayilar.isEmpty());
        sayilar.clear();
        System.out.println(sayilar.size());//0
        System.out.println(sayilar);// []
        System.out.println(sayilar.isEmpty());// true


    }
}
