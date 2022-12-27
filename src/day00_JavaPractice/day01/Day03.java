package day00_JavaPractice.day01;

public class Day03 {
    public static void main(String[] args) {

        // initializing variable// variable baslangic degeri verme

        int yas=33;
        double boy=1.70;

        System.out.println("yas :" + yas);
        System.out.println("boy :" + boy);

        // To copy the variable's value= variablelerin degerlerini kopyalayabilirsin

        int yasim=33;
        int enesYas=yasim;
        System.out.println("enesYas = " + enesYas);
        System.out.println("yasim = " + yasim);


        // you can declare multiple variables in the same line = ayni satirda birden fazla degisken bildirebilirsiniz

        int yil=2022, ay=6 , gun=20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        // updating a variable=bir degiskenin guncellenmesi
        yil=2032;
        System.out.println("update yil:" +yil);


        /*
        Bir degisken tanimlayin: x
        Baska bir degiskeni initialize edin:y
        x degiskeni initialize edin
        y degiskenini yeni bir degerle guncelleyin
         */



    }
}
