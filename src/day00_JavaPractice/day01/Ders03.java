package day00_JavaPractice.day01;

import java.util.Scanner;

public class Ders03 {
    public static void main(String[] args) {

        /*Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın
        Ipuclari:
·       Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin*/


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gunde kac bardak cay ictiginizi yaziniz");

        int bardakSayisi= scan.nextInt();

        System.out.println("gunde kac gr seker kullaniyorsunuz");
        int sekerSayisi=scan.nextInt();

        double sekersayisi = 0;
        int bardaksayisi = 0;
        double gunluksekermiktari=(sekersayisi*1.5)*bardaksayisi;
        int yillikcaymiktari=bardaksayisi*365;
        double yilliksekermiktari=(gunluksekermiktari*365)/1000;
        System.out.println("Yıllık cay tüketiminiz:"+yillikcaymiktari+"bardak"+
                "\nYıllık seker tuketiminiz:"+yilliksekermiktari+"kg");




    }

}
