/* Nama File : PelayanKonsumsi.java
 * Deskripsi : Kelas PelayanKonsumsi, Subclass Kelas Abstrak Karyawan
 * Tanggal   : 26 Maret 2026
 */

package Bioskop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class PelayanKonsumsi extends Karyawan {
    /* === ATRIBUT === */
    private String jenisKonsumsi;
    private int bonusTarget;

    /* === METODE === */
    // Konstruktor
    public PelayanKonsumsi() {

    }

    public PelayanKonsumsi(String nama, String nik, LocalDate tanggalLahir, 
                            char jenisKelamin, double gajiPokok, 
                            String jenisKonsumsi, int jumlahTargetBonus) {
        super(nama, nik, tanggalLahir, jenisKelamin, gajiPokok);
        setPosisi("Pelayan Konsumsi");
        setJenisKonsumsi(jenisKonsumsi);
        setBonusTarget(jumlahTargetBonus);
    }

    // Selektor
    public String getJenisKonsumsi() {
        return jenisKonsumsi;
    }

    public int getBonusTarget() {
        return bonusTarget;
    }

    // Mutator
    public void setJenisKonsumsi(String konsumsi) {
        jenisKonsumsi = konsumsi;
    }

    public void setBonusTarget(int jumlah) {
        bonusTarget = jumlah;
    }

    // Operator
    public int jumlahBonus() {
        // Inisialisasi
        int jumlahTarget = getBonusTarget();
        int jumlahTerjual = 200;

        // Pengecekan Kondisi
        if (jumlahTerjual > jumlahTarget) {
            return (jumlahTerjual - jumlahTarget);
        } else {
            return 0;
        }
    }

    public double hitungBonus() {
        return jumlahBonus() * 15000.0;
    }

    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + hitungBonus();
    }

    @Override
    public void printInfo() {
        // Format 
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);

        // Output
        super.printInfo();
        System.out.println("Bonus\t\t: " + Rp.format(hitungBonus()) + " ["
                            + jumlahBonus() + " Buah Ekstra]");
        System.out.println("Target\t\t: " + jumlahBonus());
    }
}

