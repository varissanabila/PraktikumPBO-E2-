/* Nama File : Kasir.java
 * Deskripsi : Kelas Kasir, Subclass Kelas Karyawan
 * Tanggal   : 26 Maret 2026
 */

package Bioskop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Kasir extends Karyawan {
    /* === ATRIBUT === */
    private int nomorStan;

    /* === METODE === */
    // Konstruktor
    public Kasir() {

    }

    public Kasir(String nama, String nik, LocalDate tanggalLahir, char jenisKelamin, double gajiPokok, int nomorStan) {
        super(nama, nik, tanggalLahir, jenisKelamin, gajiPokok);
        setPosisi("Kasir");
        setNomorStan(nomorStan);
    }

    // Selektor
    public int getNomorStan() {
        return nomorStan;
    }

    // Mutator
    public void setNomorStan(int angka) {
        if (angka <= 0) {
            throw new IllegalArgumentException("Nomor stan harus lebih dari angka 0");
        }
        
        nomorStan = angka;
    }

    // Operator
    public double hitungTunjangan() {
        // Tunjangan Risiko 10%
        return getGajiPokok() * 0.1;
    }

    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + hitungTunjangan(); 
    }

    @Override
    public void printInfo() {
        // Format
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);

        // Output
        super.printInfo();
        System.out.println("Tunjangan\t: " + Rp.format(hitungTunjangan()));
    }
}


