package day09_stringManipuations.day09_tekrar;

public class C09_sorular {
    public static void main(String[] args) {


        /*
        soru:kullanicidan bir string ve aranacak metin alin .
        String'in aranan metni icerip icermedigini indexof() metodu kullanarak yazdirin
         */

        String input = "Java ogrenen cilginlar";
        String aranacakMetin = "cilginlar";

        if (input.indexOf(aranacakMetin) >= 0) {
            System.out.println("bulunmaktadir");
        } else {
            System.out.println("bulunmamaktadir");
        }


        System.out.println("**********************");

        /*
        soru:kullanicidan bir string ve aranacak metin alin .
        String'in aranan metni icerip icermedigini LastIndexof() metodu kullanarak yazdirin
         */

        String str = "Java ogrenen cilginlar";
        String aranacakStr = "cilginlar";



        if (str.lastIndexOf(aranacakStr) >= 0 ) {
            System.out.println("bulunmaktadir");
        } else {
            System.out.println("bulunmamaktadir");


        }


    }


}

