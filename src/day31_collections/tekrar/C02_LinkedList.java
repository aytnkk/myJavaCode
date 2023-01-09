package day31_collections.tekrar;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList { // baglantili listeler demek
    public static void main(String[] args) {

        // list data turunde bir linkedlist olusturalim
        List<String> harfler=new LinkedList<>();
        harfler.add("S");
        harfler.add("D");

        System.out.println(harfler); // [S, D]

        harfler.add("E");
        System.out.println(harfler);//[S, D, E]

        // 1.indexe M ekleyelim
        harfler.add(1,"M");
        System.out.println(harfler);//[S, M, D, E]

        harfler.set(2,"L");
        System.out.println(harfler); // [S, M, L, E]


        List<String> karakterler=new LinkedList<>();
      karakterler.add("*");
      karakterler.add("#");
      karakterler.add("9");
      karakterler.add(2,"M");

        System.out.println(harfler);//[S, M, L, E]

        System.out.println(harfler.retainAll(karakterler));//true ortak karakterleri alir ,digerlerini siler
        System.out.println(harfler);//[M]

         harfler.addAll(karakterler);
        System.out.println(harfler);//[M, *, #, M, 9]

        System.out.println(karakterler.subList(1,3));//[#, M]
        System.out.println(karakterler);//[*, #, M, 9]
        System.out.println(karakterler.hashCode());//72210822

    }
}
