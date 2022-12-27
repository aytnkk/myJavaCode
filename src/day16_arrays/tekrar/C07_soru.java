package day16_arrays.tekrar;

public class C07_soru {
    public static void main(String[] args) {

        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayi=2;

        elemanBul(arr,arananSayi);//Aradiginiz 2array'de 4 adet kullanilmistir
        elemanBul(arr,8);//Aranan sayi array'de yok
        elemanBul(arr,5);//Aradiginiz 5array'de 2 adet kullanilmistir

    }


    public  static void elemanBul(int[] arr , int arananSayi){


        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==arananSayi){
                sayac++;

            }
        }
        if (sayac==0){
            System.out.println("Aranan sayi array'de yok");
        }else{
            System.out.println("Aradiginiz " + arananSayi + "array'de " + sayac + " adet kullanilmistir");
        }

    }

}
