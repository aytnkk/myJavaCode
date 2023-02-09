package day19_arraylist_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        Eger coklu element iceren bir yapidaki tum elementlere
        ayni islemi yapmak istiyorsak
        indexten bagimsiz olarak foor each loop kullanabilirsiniz
        for each loop ta uc seyi belitmemiz gerekir
        1-getirilecek elementlerin data turu
        2-getirilecek elemente verilecek isim(genelde each / w kullanilir
        3-nereden getirilecegi
         */



        int[] arr={2,4,6,8,1};
        // bu arrayin tum elementlerini yazdiralim

        for (int each:arr
             ) {
            System.out.print(each+ " ");

        }
        System.out.println(" ");
       // tum elementleri toplayalim
        int toplam=0;

        for (int each:arr
             ) {
            toplam += each;
        }
        System.out.println("sayilarin toplami : "+ toplam);

        // tum sayilarin karelerini toplayalim

        toplam=0;
        for (int each:arr
             ) {
            toplam +=each*each;
        }
        System.out.println("sayilarin karelerinin toplami  : " + toplam);
        }


    }



