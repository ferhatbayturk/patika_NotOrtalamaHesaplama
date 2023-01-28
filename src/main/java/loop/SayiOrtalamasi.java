package loop;

import java.util.Scanner;

public class SayiOrtalamasi {
    /*\
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
     3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

            double sum =0;
            double sayac =0;

        for (int i = 0; i <= sayi; i++) {

            if(i%3==0 && i%4==0){
                sayac++;
                sum+=i;
            }


        }
        System.out.println(sum/sayac);






    }
}
