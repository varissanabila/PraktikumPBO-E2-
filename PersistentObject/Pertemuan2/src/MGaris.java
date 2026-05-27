/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : Varissa Nabila Kifli / 24060124140125
 * Tanggal      : 03 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 5);

        // Membuat dua garis
        Garis G1 = new Garis(t1, t2);
        Garis G2 = new Garis(t3, t4);

        // Print garis
        System.out.print("Garis 1: ");
        G1.printGaris();
        System.out.println();

        System.out.print("Garis 2: ");
        G2.printGaris();
        System.out.println();

        // Panjang garis
        System.out.println("Panjang Garis 1: " + G1.getPanjang());

        // Gradien
        System.out.println("Gradien Garis 1: " + G1.getGradien());

        // Titik Tengah
        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah Garis 1: ");
        tengah.printTitik();
        System.out.println();

        // Persamaan garis
        System.out.println("Persamaan Garis 1: " + G1.getPersamaanGaris());

        // Cek sejajar
        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));

        // Cek tegak lurus
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        // Counter objek garis
        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}