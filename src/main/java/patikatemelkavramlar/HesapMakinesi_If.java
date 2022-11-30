package patikatemelkavramlar;

import java.util.Scanner;

public class HesapMakinesi_If {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int n1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int n2 = input.nextInt();
        System.out.println(" 1-Toplama \n 2 - Cikarma \n 3 - Carpma \n 4- Bolme  ");
        System.out.println("Seciminiz = ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama = " +(n1+n2));
                break;
                case 2:
                    System.out.println("Cikarma = " +(n1-n2));
                    break;
                    case 3:
                        System.out.println("Carpma = " +(n1*n2));
                        break;
                        case 4:
                            if(n2 == 0){
                                System.out.println("Bir sayi Sifira bolunemez");
                            }else
                            System.out.println("Bolme = " +(n1/n2));
                            break;
            default:
                System.out.println("Yanlis secim yaptiniz, 1-Toplama \n 2 - Cikarma \n 3 - Carpma \n 4- Bolme  ");
        }





    }
}
