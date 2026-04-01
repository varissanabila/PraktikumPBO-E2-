/**
 * File       : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri
 *              dengan beberapa angka terlarang
 */

public class AngkaSial {

    public void cekAngka(int angka) throws AngkaSialException {

        // validasi angka negatif
        if (angka < 0) {
            throw new AngkaSialException(angka);
        }

        // daftar angka sial
        if (angka == 13 || angka == 66 || angka == 99) {
            throw new AngkaSialException(angka);
        }

        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        int[] data = {10, 13, 25, 66, -5, 99};

        for (int angka : data) {
            try {
                as.cekAngka(angka);
            } catch (AngkaSialException e) {
                System.out.println(e.getMessage());
                System.out.println("Hati-hati memasukkan angka!!!");
            }
            System.out.println("-------------------");
        }
    }
}