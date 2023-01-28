package loop;

import java.util.Scanner;
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class TekSayılarınToplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.println("Bir sayi giriniz");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                sum += n;
            }

        } while (n % 2 == 0);
        System.out.println(sum);
    }
}
