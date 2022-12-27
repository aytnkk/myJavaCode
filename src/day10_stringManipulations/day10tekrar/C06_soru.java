package day10_stringManipulations.day10tekrar;

import java.text.DecimalFormat;

public class C06_soru {
    public static void main(String[] args) {
        /*
        kullanicinin belirli bir formatta verdigi string fiyatlari toplayip yazdirin

        input1 : "15.30 €" , input2 : "11.40 €"
          output : 36.70 €

         */

      String input1="15.30 €";
      String input2="11.40 €";

        double sayi1 = Double.parseDouble(input1.substring(0,input1.length()-1));
        double sayi2 = Double.parseDouble(input2.substring(0,input2.length()-1));
        char birim = input1.charAt(input1.length()-1);
        System.out.println(new DecimalFormat("##.##").format(sayi1+sayi2)+" "+birim);
    }
}
