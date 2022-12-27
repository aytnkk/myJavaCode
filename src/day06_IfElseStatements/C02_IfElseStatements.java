package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikizkenar ise “ikizkenar ucgen” yazdirin, degilse “ikizkenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2  && kenar1!=kenar3  )||
                (kenar2==kenar1 && kenar2!=kenar3 ) ||
                (kenar3==kenar1 && kenar3!=kenar2)){
            System.out.println("ikizkenar ucgen");
        }else{
            System.out.println("ikizkenar degil");

        }

    }
}

