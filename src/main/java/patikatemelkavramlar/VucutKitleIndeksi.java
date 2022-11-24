package patikatemelkavramlar;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
/*

        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173

 */

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz : ");
        double boy = in.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz : ");
        int kilo = in.nextInt();

        double bmi = kilo/(boy*boy);
        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz : "+boy);
        System.out.println("Lutfen kilonuzu giriniz : "+kilo);
        System.out.println("Vücut Kitle İndeksiniz : "+bmi);

    }
}
