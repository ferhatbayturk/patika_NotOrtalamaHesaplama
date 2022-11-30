package patikatemelkavramlar;

import java.util.Scanner;

public class BurcBulanProgram {
    /*
    Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
     */

    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdugunuz ay numarasini giriniz: ");
        month = input.nextInt();


        System.out.println("Dogdugunuz gun : ");
        day = input.nextInt();


        if (month == 1) {
            if (day <= 21) {
                System.out.println("Oglak burcu");
            } else {
                System.out.println("Kova burcu");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.println("Kova burcu");
            } else
                System.out.println("Balik burcu");
        } else if (month == 3) {
            if (day <= 20) {
                System.out.println("Balik burcu");
            } else System.out.println("Koc burcu");
        } else if (month == 4) {
            if (day <= 20) {
                System.out.println("Koc burcu");
            } else System.out.println("Boga burcu");
        } else if (month == 5) {
            if (day <= 21) {
                System.out.println("Boga burcu");
            } else System.out.println("Ikizler burcu");
        } else if (month == 6) {
            if (day <= 22) {
                System.out.println("Ikizler burcu");
            } else System.out.println("Yengeç burcu");
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Yengeç burcu");
            } else System.out.println("Aslan burcu");
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Aslan burcu");
            } else
                System.out.println("Basak burcu");
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Basak burcu");
            } else System.out.println("Terazi burcu");
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Terazi burcu");
            } else System.out.println("Akrep burcu");
        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Akrep burcu");
            } else System.out.println("Yay burcu");
        } else if (month == 12) {
            if (day <= 21) {
                System.out.println("Yay burcu");
            } else System.out.println("Oğlak burcu");
        } else {
            if (month < 1 || month > 12) {
                System.out.println("Yanlis ay numarasi girdiniz\nLutfen 1 ile 12 arasinda bir ay numarasi giriniz");
            } if (day < 0 || day > 31) {
                System.out.println("Yanlis gun numarasi girdiniz\nLutfen 1 ile 31 arasinda bir gun numarasi giriniz");
            }
        }

    }
}
