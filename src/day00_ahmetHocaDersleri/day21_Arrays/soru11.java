package day00_ahmetHocaDersleri.day21_Arrays;

public class soru11 {
    public static void main(String[] args) {



    int[][] arr = {{1, 3}, {4, 4, 5}, {9, 7, 4, 5}, {2}, {1, 2, 3, 4, 5}};

    // Soru 11- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
    //toplaminini yazdiran bir method olusturun


        System.out.println(tumSayilariTopla(arr));
    }

    public  static int tumSayilariTopla(int[][] arr) {
      int toplam=0;
        for (int[] innerArray : arr) {

            int sonElement = innerArray[innerArray.length - 1];

            toplam += sonElement;
        }

        return toplam;
    }

            }





