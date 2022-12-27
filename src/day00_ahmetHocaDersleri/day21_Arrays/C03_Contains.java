package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

import static java.awt.geom.Path2D.contains;

public class C03_Contains {
    public static void main(String[] args) {

        // kullanicidan aldiginiz bir ismin verilen arrayde olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String[] isimler= {"Basak","Nurullah", "Fatih", "Adem", "Enes"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiginiz  ismi giriniz");
        String arananIsim=scan.nextLine();

        boolean sonuc=contains(isimler,arananIsim);
      if (sonuc){
          System.out.println("girilen isim listede var");
      }else{
          System.out.println("girilen isim listede yok");
      }
    }

    private static boolean contains(String[] isimler, String arananIsim) {

        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {
           if (isimler[i].equalsIgnoreCase(arananIsim)){
               sonucMethod=true;

           }

        }
        return sonucMethod;
    }
}
