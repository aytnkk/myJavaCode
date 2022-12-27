package day01_programlamayaGiris.SORULAR;

import java.util.Scanner;

public class C01_sifresorusu {
    public static void main(String[] args) {

        //Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        // Ad ve soyadın baş harfleri büyük olmalıdır
        // Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        // Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //  Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        //Giriş :
        //       > Gandalf Grey 563245879632
        //Çıktı :
        //       > İsim : G****** G***
        //       > CCN : **** **** 9632


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String ad = scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz");
        String soyad = scan.nextLine();
        System.out.println("lutfen 16 haneli kart numaranizi giriniz");
        String kartNo = scan.nextLine();

        if (kartNo.length() !=16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else {
            System.out.println(ad.substring(0,1).toUpperCase()+ ad.substring(1).replaceAll("\\w","*"));
            System.out.println(soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*"));

            System.out.println(kartNo.substring(0,4).replaceAll("\\d","*")
                    +"  " + kartNo.substring(5,9).replaceAll("\\d", "*")
                    +" "+ kartNo.substring(11,15));

        }


        }

    }

