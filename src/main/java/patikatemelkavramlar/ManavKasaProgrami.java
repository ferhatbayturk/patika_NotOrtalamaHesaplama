package patikatemelkavramlar;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class ManavKasaProgrami {
    /*
    Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
     */

    public static void main(String[] args) {

       double armutF =2.14, elmaF =3.67,  domatesF = 1.11,  muzF= 0.95,  patlicanF = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kac kilo aldiniz = ");
        int armutK = input.nextInt();
        System.out.println("Elma kac kilo aldiniz = ");
        int  elmaK = input.nextInt();
        System.out.println("Domates kac kilo aldiniz = ");
        int  domatesK = input.nextInt();
        System.out.println("Muz kac kilo aldiniz = ");
        int  muzK =input.nextInt();
        System.out.println("Patlican kac kilo aldiniz = ");
        int  patlicanK = input.nextInt();

        double armutOdenen= armutF*armutK;
        double elmaOdenen= elmaF*elmaK;
        double domatesOdenen= domatesF*domatesK;
        double muzOdenen= muzF*muzK;
        double patlicanOdenen= patlicanF*patlicanK;

        double toplamOdenen = armutOdenen+elmaOdenen+domatesOdenen+muzOdenen+patlicanOdenen;

        System.out.println("Armut kac kilo : "+ armutK);
        System.out.println("Elma kac kilo : "+ elmaK);
        System.out.println("Domates kac kilo : "+ domatesK);
        System.out.println("Muz kac kilo : "+ muzK);
        System.out.println("Patlican kac kilo : "+ patlicanK);
        System.out.println("Toplam tutar : "+ toplamOdenen);












    }
}
