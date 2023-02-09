package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Scanner;

public class arrayCumleveKeilemeSayisi {
    public static void main(String[] args) {

        // kullanicidan aldigin bir parametrede kac tane cumle,kelime ve karakter oldugunu yaziniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("please.enter you  a text");
        String cumle=scan.nextLine();

        String[]cumleler=cumle.split("\\.");
        String[] kelimeler=cumle.split(" ");
        String[]karakterler=cumle.split("");

        System.out.println("cumleler :" + cumleler.length + " " + "kelimeler: " + kelimeler.length +" "
                + "karakterler:" + karakterler.length );
        }




















    }

