/* Nama File : Karyawan.java
 * Deskripsi : Kelas Abstrak Karyawan
 * Tanggal   : 25 Maret 2026
 */

package Bioskop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Karyawan {
    /* === ATRIBUT === */
    // Identitas
    protected String nik;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected char jenisKelamin;

    // Kepegawaian
    protected String posisi;
    protected double gajiPokok;

    /* === METODE === */
    // Konstruktor
    protected Karyawan() {

    }

    protected Karyawan(String nama, String nik, LocalDate tanggalLahir, char jenisKelamin, double gajiPokok) {
        setNama(nama);
        setNIK(nik);
        setTanggalLahir(tanggalLahir);
        setJenisKelamin(jenisKelamin);
        setGajiPokok(gajiPokok);
    }

    // Selektor
    public String getNIK() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public String getPosisi() {
        return posisi;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    // Mutator
    public void setNIK(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggal) {
        tanggalLahir = tanggal;
    }

    public void setJenisKelamin(char kelamin) {
        if (kelamin != 'L' && kelamin != 'P') {
            throw new IllegalArgumentException("Kelamin " + kelamin + " tidak valid (Harus L atau P)");
        } 
        
        jenisKelamin = kelamin;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGajiPokok(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh memiliki nilai negatif");
        }
        
        gajiPokok = gaji;
    }
    
    // Operator
    /// Gaji Total merekap Gaji Pokok dan Income lainnya (seperti bonus, tunjangan, dll)
    public abstract double hitungGajiTotal();

    public void printInfo() {
        // Format
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);
        DateTimeFormatter formatID = DateTimeFormatter.ofPattern("d MMMM yyyy", indo);

        // Output
        System.out.println("======= [" + getNama() + "] =======");
        System.out.println("NIK\t\t: " + getNIK());
        System.out.println("Tanggal Lahir\t: " + getTanggalLahir().format(formatID));
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Posisi\t\t: " + getPosisi());
        System.out.println("Gaji Pokok\t: " + Rp.format(getGajiPokok()));
        System.out.println("Gaji Total\t: " + Rp.format(hitungGajiTotal()));
    }
}