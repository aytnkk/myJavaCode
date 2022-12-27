package day11_forLoops.day11_ornek;

public class C04_forloop {
    public static void main(String[] args) {

        // input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input = 23;

        if (input > 1) {
            for (int i = input; i <= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = input; i <= 1; i++) {
                System.out.print(i + " ");

            }

        }
    }
}

