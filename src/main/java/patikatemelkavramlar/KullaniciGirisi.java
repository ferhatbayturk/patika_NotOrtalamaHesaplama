package patikatemelkavramlar;

import java.util.Scanner;

public class KullaniciGirisi {
    /*
    Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
  unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
  şifreler aynı ise ekrana "Şifre oluşturulamadı,
  lütfen başka şifre giriniz."
  sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */

    public static void main(String[] args) {

        String sifre, usarname, yeniSifre, tercih;


        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        usarname = input.nextLine();
        System.out.println("Sifreniz : ");
        sifre = input.nextLine();


        if (usarname.equals("ferhat") && sifre.equals("ferhat5255")) {
            System.out.println("Giris basarili");

        } else if (sifre != "ferhat5255" && usarname.equals("ferhat")) {
            System.out.println("Yanlis sifre");
            System.out.println("Sifrenizi sifirlamak ister misiniz?");
            tercih = input.nextLine();

            if (tercih.equals("evet")) {
                System.out.println("yeni sifrenizi giriniz");
                System.out.println("yeni girdiği şifrenin hatalı girdiğin ve\n" +
                        "  unuttuğu şifre ile aynı olmaması gerekir");

                System.out.println("Lutfen yeni sifre giriniz : ");
                sifre = input.nextLine();

                if (sifre.equals("ferhat5255")) {

                    System.out.println("Sifre olusturulamadi \nFarkli sifre giriniz");
                    yeniSifre = input.nextLine();
                    System.out.println("sifre olusturuldu");
                }


            }
        }
    }
}
