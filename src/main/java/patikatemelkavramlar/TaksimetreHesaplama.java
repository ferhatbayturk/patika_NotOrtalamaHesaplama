package patikatemelkavramlar;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */

int minTuar=20;
double kmBasina =2.20, start=10;



        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi giriniz : ");
        double mesafe = input.nextDouble();

        double toplam = kmBasina*mesafe;
        toplam+=start;

        toplam = (toplam<20)? 20: toplam;

        System.out.println(mesafe+ " gidildi. Odenecek Tutar  =  " + toplam);

    }
}
