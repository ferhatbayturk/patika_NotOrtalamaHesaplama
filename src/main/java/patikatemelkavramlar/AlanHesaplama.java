package patikatemelkavramlar;

import java.util.Scanner;

public class AlanHesaplama {
    /*
    Ödev
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

            𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

     */
    public static void main(String[] args) {

        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print(" 1. kenari giriniz= ");
        a = input.nextDouble();
        System.out.print(" 2. kenari giriniz = ");
        b = input.nextDouble();
        System.out.print(" 3. kenari giriniz = ");
        c = input.nextDouble();

        double u = (a + b + c)/2;


        double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alani = " + alan);


    }
}
