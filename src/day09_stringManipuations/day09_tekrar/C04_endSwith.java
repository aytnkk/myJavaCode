package day09_stringManipuations.day09_tekrar;

import java.util.Scanner;

public class C04_endSwith {
    public static void main(String[] args) {
     // bu metod sonun verilen deger ile bitip bitmedigini kontrol eder
        String str = "Java ogrenen sessiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));// true
        System.out.println(str.endsWith("Java ogrenen sessiz kalmaz"));// true
        System.out.println(str.endsWith(""));// true




         /*SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa “gecersiz mail”
        - mail @gmail.com icermiyorsa, “mail gmail olmali”
        - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String girilenMail = scan.nextLine();

        if (!girilenMail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }


    }
}
