package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Arrays;

public class soru {
    public static void main(String[] args) {

      /* Verilen 2 katli bir array’de ayni index’e
        sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */
                int[][] arr = {{3,4,5}, {2,3,6,7},{6,7,1},{3,5,6},{3,5}};

                int enkucukIndex=arr[0].length;

                for (int i = 0; i < arr.length ; i++) {
                    if (enkucukIndex>arr[i].length){
                        enkucukIndex=arr[i].length;
                    }
                }
                int toplam=0;

                int [] arr1=new int[enkucukIndex];
                for (int i = 0; i <enkucukIndex ; i++) {
                    for (int j = 0; j <arr.length ; j++) {
                        toplam+=arr[j][i];
                        arr1[i]=toplam;
                    }

                    toplam=0;
                }
                System.out.println(Arrays.toString(arr1));
            }
    }


