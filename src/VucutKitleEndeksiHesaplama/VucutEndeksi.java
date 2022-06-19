package VucutKitleEndeksiHesaplama;

import java.util.Scanner;

public class VucutEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float kiloKG;

        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kiloKG = input.nextFloat();

        float boyCM;

        System.out.print("Boyunuzu cm cinsinden giriniz: ");
        boyCM = input.nextFloat();

        float endeks;
        endeks = (kiloKG)/(boyCM*boyCM);
        System.out.print("Vucut kitle endeksiniz: " + endeks);

    }
}
