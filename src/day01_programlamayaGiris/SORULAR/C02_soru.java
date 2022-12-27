package day01_programlamayaGiris.SORULAR;

import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {

     /*Kullanıcıdan bir String ve bir karakter alınız.
    String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
    sayısını sayınız.
    Boşluk karakterlerini saymayınız.
    Kod, kullanıcının seçtiği karakter String 'de sadece bir kez varsa konsolda -1,
    Kod, kullanıcının seçtiği karakter String 'de yoksa konsolda -1 döndürsün.
    Örneğin; "Java is easy" - 'a' ==> 5
    "Java is easy" - 'w' ==> -1
    "Java is easy" - 'e' ==> -1
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cümle= scan.nextLine();
        System.out.println("bir karakter giriniz");
        char krk=scan.next().charAt(0);
        cümle=cümle.replaceAll(" ", "");



        int krkSayisi=cümle.lastIndexOf(krk)-cümle.indexOf(krk);

        if (krkSayisi==0){
            System.out.println("-1");
        } else if (krkSayisi>=1) {

            System.out.println(krk + " karakter sayisi: " +(krkSayisi-1));

        }else{
            System.out.println("-1");
        }

            
        }
    }

