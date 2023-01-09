package day31_collections.tekrar;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {



        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);//[J, L]

        harfler.addFirst("B");
        System.out.println(harfler);//[B, J, L]


        System.out.println(harfler.removeFirst());//ilk harfi siler // B
        System.out.println(harfler);//[J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");

        System.out.println(harfler);//[A, J, L, A, K]

        // sona dogru olan A'yi silin
        System.out.println(harfler.removeLastOccurrence("A"));// true
        System.out.println(harfler);// [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T"));// false // t diye bir deger yok


        LinkedList<String> karakterler=new LinkedList<>();

        karakterler.push("A"); // addFirst ile ayni islemi yapar
        karakterler.push("B");
        System.out.println(karakterler); // [B, A]

        System.out.println(karakterler.clone());// [B, A]

        LinkedList<String> kopyakarakterler= (LinkedList<String>) karakterler.clone();
        System.out.println(kopyakarakterler); // [B, A]
    }


    }
