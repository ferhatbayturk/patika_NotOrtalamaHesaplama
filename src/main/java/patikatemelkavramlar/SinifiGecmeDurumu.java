package patikatemelkavramlar;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    /*
      Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
      Geçme Notu : 55
  Ödev
      Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
       */
    public static void main(String[] args) {


        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        if(mat<0 ||mat>100){
            mat = 0;
        }

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            fizik = 0;
        }

        System.out.println("Turkce notunuz : ");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100){
            turkce = 0;
        }

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            kimya = 0;
        }

        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            muzik=0;
        }

        double ortalama = (mat+fizik+turkce+kimya+muzik)/5;


        if(ortalama<55){
            System.out.println("Sinifta kaldiniz... \nOrtalamaniz = "+ortalama);

        }else System.out.println("Tebrikler ... Sinifi Gectiniz\nOrtalamaniz = " + ortalama);

    }
}
