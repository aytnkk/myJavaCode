package day08_stringManupilations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";
        System.out.println(str.length());// karakter sayisi //19

        // Metnin tam ortasindaki karakter nedir?

        System.out.println(str.charAt(str.length()/2));// n

        //son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));//p


        // Bir karakteri degil de verilen String'in icerdigi bir metin parcasini elde etmek istersek
        // ornegin: "ogren" kelimesini yazdiralim

        System.out.println(str.substring(5,9));//ogre
        // substring(bas,bitis) method'unda
        // baslangic olarak yazilan index dahil(inclusive)
        // bitis olarak yazilan index haric(exclusive)'dir

        System.out.println(str.substring(5, 10));//ogren

        // str'dan java kelimesini yazdiralim

        System.out.println(str.substring(0,4));//java


        // str'dan "kap" yazdiralim
        System.out.println(str.substring(16,19));//kap

        System.out.println(str.substring(16));//kap

        System.out.println(str.substring(str.length()-3));//kap

        // substring kullanarak sadece J harfini yazdirin

        System.out.println(str.substring(0,1));

        // substring kullanarak 9.indexteki harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(9,10).toUpperCase());//N
        System.out.println(str.toUpperCase().charAt(9));//N

        // charAt kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));// hicliktir konsol bos olur

        // System.out.println(str.substring(4,3)); // hata verir cunku buyukten baslayip kucuge gidemez

       // System.out.println(str.substring(25,28));// StringIndexOutOfBoundsException


        System.out.println(str.substring(str.length()));// 19 dan sonra hiclik var // hiclik yazdirir
        //System.out.println(str.charAt(str.length()));// error
        //System.out.println(str.substring(str.length()+1));// error
        System.out.println("=================");






    }
}
