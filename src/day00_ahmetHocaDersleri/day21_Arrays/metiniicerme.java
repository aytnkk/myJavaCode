package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class metiniicerme {
    public static void main(String[] args) {


        //Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini indexOf( ) method’u kullanarak yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String girilenCumle=scan.nextLine().toLowerCase();

        System.out.println("aranacak metni giriniz");
        String aranacakMetin=scan.nextLine();

        if (!girilenCumle.contains(aranacakMetin)){
            System.out.println("aranan metin cumlede yok");
        }else{
            int aranacakMetinIndexi=girilenCumle.indexOf(aranacakMetin);
            int boslukIndexi=girilenCumle.indexOf(" ",aranacakMetinIndexi);

            System.out.println(girilenCumle.substring(aranacakMetinIndexi,boslukIndexi));
        }





    }
}
