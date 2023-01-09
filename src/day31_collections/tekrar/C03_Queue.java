package day31_collections.tekrar;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);

        // 1.index'e F  ekleyelim
        // Queue ozelliginden dolayi ekleme sona olmali,ortaya ekleme olmaz

        System.out.println(harfler.remove());
        System.out.println(harfler);

        System.out.println(harfler.remove("K"));
        System.out.println(harfler);

        System.out.println(harfler.element());
        System.out.println(harfler);

        System.out.println(harfler.peek());
        System.out.println(harfler);

        Queue<String> karakterler=new LinkedList<>();
        // System.out.println(karakterler.element()); //NoSuchElementException

        System.out.println(karakterler.peek()); // null

        System.out.println(harfler.poll());  //B
        System.out.println(harfler); //[K]


        // System.out.println(karakterler.remove());//NoSuchElementException
        System.out.println(karakterler.poll()); //null

        harfler.offer("C");
        System.out.println(harfler);//[K, C]

        // add ile offer arasindaki fark offer ,varsa kapasiteyi kontrol eder
        // kapasite uygunsa ekler
        // add ise kapasiteye bakmaksizin direkt ekler.


    }
}
