package patikatemelkavramlar;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
         Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
          ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        int mesafe, yas, secim;


        Scanner input = new Scanner(System.in);
        System.out.println("Kac Km yolculuk yapacaksiniz = ");
        mesafe = input.nextInt();

        System.out.println("Yasiniz kac = ");
        yas = input.nextInt();


        System.out.println("Yolculuk tipini seciniz \nTek Yon icin 1 e basiniz \nGidis Donus icin 2 ye basiniz ");
        secim = input.nextInt();

            double normalbiletFiyati = mesafe * 0.10;
            double bF12YasKucuk = normalbiletFiyati - (normalbiletFiyati * 0.5);
            double bF12Yas24Arasi = normalbiletFiyati - (normalbiletFiyati * 0.1);
            double yas65Ustu = normalbiletFiyati - (normalbiletFiyati * 0.3);

            double gidisDonusFiyat = normalbiletFiyati - (normalbiletFiyati * 0.2);
            double gidisDonus12YasKucuk = gidisDonusFiyat - (gidisDonusFiyat * 0.5);
            double gidisDonus12Yas24Arasi = gidisDonusFiyat - (gidisDonusFiyat * 0.1);
            double gidisDonus65Ustu = gidisDonusFiyat - (gidisDonusFiyat * 0.3);


            if (secim == 1) {

                if (yas > 0 && yas < 13) {
                    System.out.println("Odeyeceginiz ucret = " + bF12YasKucuk);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Odeyeceginiz ucret = " + bF12Yas24Arasi);
                } else if (yas > 65 && yas < 150) {
                    System.out.println("Odeyeceginiz ucret = " + yas65Ustu);

                } else
                    System.out.println("Odeyeceginiz ucret = " + normalbiletFiyati);


            } else if (secim == 2) {
                if (yas > 0 && yas < 13) {
                    System.out.println("Odeyeceginiz ucret = " + gidisDonus12YasKucuk);
                } else if (yas > 12 && yas < 24) {
                    System.out.println("Odeyeceginiz ucret = " + gidisDonus12Yas24Arasi);
                } else if (yas > 65 && yas < 150) {
                    System.out.println("Odeyeceginiz ucret = " + gidisDonus65Ustu);

                } else
                    System.out.println("Odeyeceginiz ucret = " + gidisDonusFiyat);


            }else
                System.out.println("Hatali giris yaptiniz...");



    }
}
