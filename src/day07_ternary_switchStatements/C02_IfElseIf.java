package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {



         /*
        kullanocidan bir tam sayi alin
        sayi negatif ise "negatif sayi"
        sayi rakam ise "girilen sayi rakam"
        sayi 2 basamakli ise girilen sayi iki basamakli
        sayi iki basamaktan buyukse "buyuk sayi" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi<0) System.out.println("Negatif sayi");
        // kod en basta bunu calistirir o yuzden digerleri karismaz
        else if (girilenSayi<=9) System.out.println("Girilen sayi rakam");
        else if (girilenSayi<=99) System.out.println("Girilen sayi 2 basamakli");
        else System.out.println("Buyuk sayi");{

        }
        {

        }


    }
}
