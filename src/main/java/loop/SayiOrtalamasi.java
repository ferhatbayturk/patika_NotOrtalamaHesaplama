package loop;

import java.util.Scanner;

public class SayiOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

            double sum =0;
            double sayac =0;

        for (int i = 0; i < sayi; i++) {

            if(i%3==0 && i%4==0){
                sayac++;
                sum+=i;
            }


        }
        System.out.println(sum/sayac);






    }
}
