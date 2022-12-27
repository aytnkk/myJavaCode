package day09_stringManipuations;

public class C07_IlkTest {
    public static void main(String[] args) {

        // Gittigimiz web sayfasindan aldigimiz
      // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin


        String input = "1-48 of 87 results for \"nutella\"";
        int index0f=input.indexOf("of");
        int indexResultat=input.indexOf("results");

        String sonucSayisiString=input.substring(index0f+3,indexResultat-1);



        // arama sonuc sayisinin 50'den fazla oldugunu test edin
        int sonucSayisiInt=Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50){
            System.out.println("Nutella arama testi PASSED");
        }else{
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FAILED");

        }
        }
    }

