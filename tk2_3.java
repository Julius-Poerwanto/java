import java.util.Scanner;
import java.lang.Math;

public class tk2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi, jari_jari, panjang, lebar, tinggi;
        int menu;

        jari_jari = 0;
        panjang = 0;
        tinggi = 0;
        phi = 3.14;

        do {
        System.out.print("\n\n=============== HITUNG LUAS PERMUKAAN DAN VOLUME ===============");
        System.out.print("\nPilih menu (1/2/3/4): \n1. Luas permukaan dan volume tabung \n2. Luas permukaan dan volume Balok \n3. Luas permukaan dan volume bola \n4. Keluar \nPilih: ");
        menu = input.nextInt();

            //TABUNG
            if (menu == 1) {
                System.out.print("Masukkan jari-jari: ");
                jari_jari = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextDouble();

            System.out.println("\nLUAS PERMUKAAN DAN VOLUME TABUNG");
            System.out.print("Luas permukaan tabung: " + 2 * phi * jari_jari * ( jari_jari * tinggi ));
            System.out.print("\nVolume tabung: " + phi * jari_jari * tinggi);
            }

            //BALOK
            if (menu == 2) {
                System.out.print("Masukkan panjang: ");
                panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                lebar = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextDouble();
            
            System.out.println("\nLUAS PERMUKAAN DAN VOLUME BALOK");
            System.out.print("Luas permukaan balok: " + ((2 * panjang * lebar) + 2 * (lebar * tinggi) + 2 * (panjang * tinggi)));
            System.out.print("\nVolume balok: " + panjang * lebar * tinggi);
            }

            //BOLA
            if (menu == 3) {
                System.out.print("Masukkan jari-jari: ");
                jari_jari = input.nextDouble();

                System.out.print("\nLUAS PERMUKAAN DAN VOLUME BOLA");
                System.out.print("Luas permukaan bola: " + 4 * phi * Math.pow(jari_jari,2));
                System.out.print("\nVolume bola: " + (4 * phi * Math.pow(jari_jari,3)) / 3);
            }
           
            //KELUAR
            if (menu == 4) {
                System.out.print("=============== Selesai ===============");
            }
        }
        while(menu != 4);
        input.close();
    }
}



//volume balok V = p x l x t
//luas permukaan 2 x p x l + 2 x l x t + 2 x p x t
//= 2 ( pl + lt + pt)

//volume tabung V = phi x r x t
//luas permukaan L = 2 x phi x r x (r + t)

//volume bola 4 x 1/3 x phi x r^3
//luas permukaan 4 x phi x r^2

//https://katadata.co.id/safrezi/berita/6178d56d43ea6/rumus-volume-balok-dan-luas-permukaan-balok-beserta-contoh-soal