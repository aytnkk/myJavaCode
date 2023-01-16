package day35_GenelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        /*
        verilen bir LinkedList'de istenen iki index'deki elementlerin yerlerini degistirin.

         */

        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Said");
        isimler.add("ayse");
        isimler.add("Huseyin");
        isimler.add("Sevilay");
        isimler.add("Hasan");
        isimler.add("Humeyra");

        System.out.println(isimler);

        // Huseyin ile humeyranin yerini degistirelim
        // buyuk bir listede index bilmeden yapalim
        String ilkIsim="Huseyin";
        String ikinciIsim="Humeyra";

        String temp="";
        temp=ilkIsim;

        int ilkIisimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkIisimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);




    }
}
