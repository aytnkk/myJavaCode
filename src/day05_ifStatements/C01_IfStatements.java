package day05_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {


        //ogrenciden notunu rakam olarak alip harf olarak yazdirin
        // 0-49,999 DD
        // 50-64,999 CC
        // 65-84,999  BB
        // 85-100 AA


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (0<= not && not<50){
            System.out.println("Nozunuz DD, maalesef kaldiniz");
        }
        if (50<=not && not<65){
            System.out.println("Notunuz CC ,tebrikler gectiniz");
        }
        if (65<=not && not<85){
            System.out.println("Notunuz BB,tebrikler gectiniz");
        }
        if (85<=not && not<=100){
            System.out.println(" tebrikler ,Notunuz AA");
        }


    }
}
