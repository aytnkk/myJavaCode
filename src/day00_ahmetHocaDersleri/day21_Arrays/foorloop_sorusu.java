package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class foorloop_sorusu {
    public static void main(String[] args) {


        //  kullanicidan bir char alip ,
        // o karakterden sonra gelen 20 karakteri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krktr=scan.next().charAt(0);

        for (int i = 1; i <=20 ; i++) {
            System.out.print((char)(krktr+i) + " ");


        }
            }
        }


