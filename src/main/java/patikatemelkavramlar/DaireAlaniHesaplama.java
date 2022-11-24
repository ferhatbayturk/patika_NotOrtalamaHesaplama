package patikatemelkavramlar;

import java.util.Scanner;

public class DaireAlaniHesaplama {
    /*
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {


        Scanner input = new Scanner  (System.in);
        System.out.println("Dairenin yaricapini giriniz");
        double r = input.nextDouble();
        System.out.println("Daire diliminin merkez aci olcusunu giriniz");
        double a = input.nextDouble();

        double 𝜋 = 3.14;

        double dilimAlani = (𝜋 * (r*r) * a) / 360;
        System.out.println("Daire diliminin alanı = "+ dilimAlani);

    }
}
