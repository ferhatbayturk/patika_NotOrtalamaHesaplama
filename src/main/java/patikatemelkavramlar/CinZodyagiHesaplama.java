package patikatemelkavramlar;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    /*
    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz");
        int yil = input.nextInt();

        if (yil%12==0){
            System.out.println("Çin Zodyağı Burcunuz :  Maymun");
        }else if (yil%12==1){
            System.out.println("Çin Zodyağı Burcunuz :   Horoz");
        }else if (yil%12==2){
            System.out.println("Çin Zodyağı Burcunuz :   Köpek");
        }else if (yil%12==3){
            System.out.println("Çin Zodyağı Burcunuz :    Domuz");
        }else if (yil%12==4){
            System.out.println("Çin Zodyağı Burcunuz :     Fare");
        }else if (yil%12==5){
            System.out.println("Çin Zodyağı Burcunuz :     Öküz");
        }else if (yil%12==6){
            System.out.println("Çin Zodyağı Burcunuz :      Kaplan");
        }else if (yil%12==7){
            System.out.println("Çin Zodyağı Burcunuz :     Tavşan");
        }else if (yil%12==8){
            System.out.println("Çin Zodyağı Burcunuz :      Ejderha");
        }else if (yil%12==9){
            System.out.println("Çin Zodyağı Burcunuz :     Yılan");
        }else if (yil%12==10){
            System.out.println("Çin Zodyağı Burcunuz :     At");
        }else if (yil%12==11){
            System.out.println("Çin Zodyağı Burcunuz :     Koyun");
        }else System.out.println("Gecerli bir dogum yili giriniz");


    }

}
