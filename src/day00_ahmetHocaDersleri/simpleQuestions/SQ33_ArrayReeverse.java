package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.Arrays;

public class SQ33_ArrayReeverse {
    public static void main(String[] args) {
        /*
        Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
 bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
---------------------------------------------------
         */

        String str="Kodlama harika.";
        char arr[]=new char[str.length()];

        for (int i = str.length()-1; i >=0 ; i--) {

            arr[str.length()-1-i]=str.charAt(i);

        }
        System.out.println(arr);
    }


    }

