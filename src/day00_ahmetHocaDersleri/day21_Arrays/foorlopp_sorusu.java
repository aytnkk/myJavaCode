package day00_ahmetHocaDersleri.day21_Arrays;

public class foorlopp_sorusu {
    public static void main(String[] args) {


        // input olarak verilen bir Stringde
        // indexi tek sayi olanlari kucuk harfle
        //  index'i cift sayi olanlari buyuk harfle yazdirin
        //ornek : Java  output: JaVa

        String input="Java candir, Selenium heyecandir";
        for (int i = 0; i <input.length() ; i++) {

            if (i%2==0){
                System.out.print(input.toUpperCase().substring(i,i+1));

            }else{
                System.out.print(input.toLowerCase().substring(i,i+1));


                System.out.println("=================");



                }

                }
            }
        }


