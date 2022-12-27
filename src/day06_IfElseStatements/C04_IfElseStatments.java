package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatments {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println(" Girilen harf Buyuk harf");
        }else{
            System.out.println("Girilen harf buyuk harf degil");
        }




    }
}
