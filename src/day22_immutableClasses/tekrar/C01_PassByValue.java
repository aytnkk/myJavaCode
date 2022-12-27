package day22_immutableClasses.tekrar;

import java.util.ArrayList;
import java.util.List;

import static day22_immutableClasses.C01_PassByValue.yeniListAta;

public class C01_PassByValue {
    public static void main(String[] args) {

        // verilen bir List'de degisiklik yapan 2 method olusturun
        // 1.method list'in elementlerine yeni deger atayip yazdirsin
        // 2.method, list'e yeni bir list degeri atayip, yeni list'e
        //   elementler ekleyip yazdirsin
        // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim

       List<Integer> sayilar=new ArrayList<>();
       sayilar.add(10);
       sayilar.add(34);
       sayilar.add(45);

        System.out.println(sayilar); // [10, 34, 45]
        elementleriDegistir(sayilar);
    System.out.println("1.method call'dan sonra sayilar : " + sayilar); // [25, 54, 67]
        yeniListAta(sayilar);
        System.out.println("2.method call'dan sonra sayilar : " + sayilar); // [25, 54, 67]



    }
    public  static void elementleriDegistir(List<Integer> sayilar){

        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlari degistir methodunda list : " + sayilar);





    }
    public static void yeniListeAta(List<Integer> sayilar){
        sayilar=new ArrayList<>();

        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);

        System.out.println("Yeni list ata methodunda sayilar list'inin son hali : " + sayilar);

    }
}
