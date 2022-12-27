package day19_arraylist_forEachLoop.tekrar;

import day19_arraylist_forEachLoop.Toyota;

public class ToyotaRunner {
    public static void main(String[] args) {
        day19_arraylist_forEachLoop.Toyota toyota1=new Toyota();

        System.out.println(toyota1.marka + ", "
                +toyota1.model+ ", "
                +toyota1.yil+", "
                +toyota1.km+", "
                +toyota1.renk+", ");
        // Toyota, Model belirtilmemis, 0, 0, null,

        toyota1.model="Corolla";
        toyota1.yil=2020;
        toyota1.km=5000;

        System.out.println(toyota1.marka + ", "
                +toyota1.model+ ", "
                +toyota1.yil+", "
                +toyota1.km+", "
                +toyota1.renk+", ");
        // Toyota, Corolla, 2020, 5000, null,
    }

}



