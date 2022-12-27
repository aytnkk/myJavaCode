package day00_ahmetHocaDersleri.day21_Arrays;

public class ciftSayilar {
    public static void main(String[] args) {

         /*
        "Verilen 2 katli bir array’de
         bulunan cift sayilari toplayip, sonucu yazdiran bir
          method olusturun."
         */

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7},{8,5,2}};
        ciftSayilariToplama(arr);

    }public static void ciftSayilariToplama(int [][] arr){
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];

                }

            }

        }
        System.out.println("cift sayilarin toplamı :"+toplam);
    }

    }
