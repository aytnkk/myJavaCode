package day11_forLoops;


import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
      //  Soru4: Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.

        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         **********

      */

        int kisaKenar=10;


        for (int i =1; i <=kisaKenar; i++) {
            System.out.println("");
            for (int j =1; j <=i ; j++) {
                System.out.print("*");

            }


        }

        }

    }



