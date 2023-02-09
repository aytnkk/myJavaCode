package day19_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_Constructor {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        Random rdn=new Random();

        List<Integer> sayilar=new ArrayList<>();

        // sayilar Arraylist classindan olusturdugumuz bir objedir
        // ve olusturuldugu class'daki tum ozelliklere(method ve variableler) sahiptir.

        /*
        bir class'dan bir obje olusturdugumuzda
        o classdaki tum instance variable'lerin bir kopyasi olusturulup
        objemizle iliskilendirilir.
        ayrica o class'da bulunan tum method 'larda objemizle iliskilendirilir

        Bu islemleri saglayan java yapisi CONSTRUCTOR'dir
        bu isleme de initalize (ilk deger atamasi) denir.

        new keyword ile obje olusturulurken esitligin saginda new ile birlikte classIsmi() yazilir.
        iste bu class ismi()  o class'in constructor'idir  .
        Constructor, bugune kadar gordugumuz yapilardan farklidir.

         Constructor, bir obje olusturmak istedigimizde devreye girer
         ve ilgili sinifin tum ozelliklerini obje ile iliskilendirir(initialize)
         */
    }
}
