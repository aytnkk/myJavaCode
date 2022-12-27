package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class burcSoru {
    public static void main(String[] args) {


        ////2.Çözüm SWITCH  ile:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı Ay'da doğduğunuzu giriniz : ");
        int ayNo = scanner.nextInt();

        System.out.println("Lütfen Ay'ın kaçıncı günü doğduğunuzu giriniz : ");
        int gun = scanner.nextInt();

        String burc = "";

        if (!(ayNo <= 12 && ayNo > 0 && gun > 0 && gun <= 31)) {
            System.out.println("Hatalı giriş");
        } else {
            switch (ayNo) {
                case 1:
                    if (gun >= 1 && gun <= 19) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                    break;
                case 2:
                    if (gun >= 1 && gun <= 17) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                    break;
                case 3:
                    if (gun >= 1 && gun <= 19) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                    break;
                case 4:
                    if (gun >= 1 && gun <= 19) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                    break;
                case 5:
                    if (gun >= 1 && gun <= 20) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                    break;
                case 6:
                    if (gun >= 1 && gun <= 20) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                    break;
                case 7:
                    if (gun >= 1 && gun <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                    break;
                case 8:
                    if (gun >= 1 && gun <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                    break;
                case 9:
                    if (gun >= 1 && gun <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                case 10:
                    if (gun >= 1 && gun <= 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                case 11:
                    if (gun >= 1 && gun <= 23) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                case 12:
                    if (gun >= 1 && gun <= 23) {
                        burc = "Yay";
                    } else {
                        burc = "Oglak";
                    }
            }
            System.out.println(ayNo + ".ayın " + gun + ".gününde doğduğunuz için \n" +
                    "Burcunuz :" + burc + " ");

        }
    }
}
