package patikatemelkavramlar;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    /*
    Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {

        int healt;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hava sicakligini giriniz  : ");
        healt = input.nextInt();

        if (healt < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz...");

        } else if (healt<=15) {
            System.out.println("Sinema izlemeye gidebilirsiniz...");

        } else if (healt <= 25) {
            System.out.println("Piknige gidebilirsiniz...");

        } else if (healt <= 30) {
            System.out.println("Yuzmeye gidebilirsiniz...");

        } else System.out.println("Bu sicakta yayla daha iyi olur...");


    }
}
