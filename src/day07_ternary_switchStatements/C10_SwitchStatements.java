package day07_ternary_switchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan gun numarasini alip
        // gun ismini yazdirin


        int gunNo = 3;

        switch (gunNo) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                System.out.println("Haftaici");
                break;
                    case 6:
                    case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");


        }
    }
}