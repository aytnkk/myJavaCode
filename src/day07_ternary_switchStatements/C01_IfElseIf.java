package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        /*
        kullanocidan bir tam sayi alin
        sayi rakam ise "girilen sayi rakam"
        sayi 2 basamakli ise girilen sayi iki basamakli
        sayi iki basamaktan buyukse "buyuk sayi" yazdirin
         */
        /*
        eger if else cumleleri ELSE ile bitmiyorsa tum durumlari kapsamaz
        yani bazi degerler icin hic bir if body'si calismayabilir
        Bu tur sorulari cozerken sartlarin tamamini dikkatli yazmak gerekir
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");

        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("Buyuk sayi");{

        }
        {

        }

    }
}
