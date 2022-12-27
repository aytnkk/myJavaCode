package day18_arrays.tekrar;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler.remove("Z"));
        System.out.println(harfler);
        System.out.println(harfler.remove(0));//A
        // 0.index'deki elementi siler ve gorevi tamamlayip silinen elementi bize dondurur
        System.out.println(harfler);// [T]

        List<String> yeniList=new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harfler));//true
        System.out.println(yeniList);// [C, D]
        System.out.println(harfler);// [T]






    }
}
