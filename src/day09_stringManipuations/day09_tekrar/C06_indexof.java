package day09_stringManipuations.day09_tekrar;

import java.util.Scanner;

public class C06_indexof {
    public static void main(String[] args) {

        // kullanicidan aldigimiz cumlede "cok" ile baslayan ilk kelimeyi yazdirin
        // cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String girilenCumle=scan.nextLine();

        if (!girilenCumle.contains("cok")){
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else{
            int cokIndexi=girilenCumle.indexOf("cok");
            int boslukIndexi=girilenCumle.indexOf(" ",cokIndexi+1);
            System.out.println(girilenCumle.substring(cokIndexi,boslukIndexi));


        }



    }
}
