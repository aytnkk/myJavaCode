package day08_stringManupilations;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesiyor, degil mi?";
        // sondan ucuncu karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));// m

        System.out.println(str.length());//50

        // rastgele bir karakterini yazdiralim

        Random rnd= new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index= rnd.nextInt(str.length()); // str.length()'den kucuk rastgele bir int uretir
        System.out.println(str.charAt(index));




    }
}
