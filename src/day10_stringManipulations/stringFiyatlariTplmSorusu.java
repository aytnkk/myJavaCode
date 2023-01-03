package day10_stringManipulations;

public class stringFiyatlariTplmSorusu {
    public static void main(String[] args) {

        /*
        kullanicidan belirli bir formatta verdigi string fiyatlari toplayip yazdirin
         */

        String input1="15.30 €";
        String input2="11.40 €";


      double fiyat1=Double.parseDouble(input1.replace("€",""));
      double fiyat2=Double.parseDouble(input2.replace("€",""));

     double toplam=(int)(fiyat1+fiyat2);
        System.out.println(toplam);

    }

}
