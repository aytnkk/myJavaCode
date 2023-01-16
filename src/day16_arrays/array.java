package day16_arrays;

public class array {
    public static void main(String[] args) {
        // bir array'in icinde isimlerin kac defa kullanildigini yazdirin

        String[] isimler = {"hasan", "huseyin", "ahmet", "mehmet","ahmet" ,"ahmet"};

        String bos = "";
        for (int i = 0; i < isimler.length; i++) {

            if (!bos.contains(isimler[i])) {

                int sayi = 1;
                for (int j = i + 1; j < isimler.length; j++) {

                    if (isimler[i].equalsIgnoreCase(isimler[j])) {
                        sayi++;


                    }
                }
                System.out.println(isimler[i] + " " + sayi);
                bos += isimler[i];
            }
        }
    }
}