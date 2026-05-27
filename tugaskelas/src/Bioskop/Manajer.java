/* Nama File : Manajer.java
 * Deskripsi : Kelas Manajer, Subclass Kelas Karyawan
 */


package Bioskop;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;


public class Manajer extends Karyawan {
    /* === ATRIBUT === */
    private double tunjanganJabatan;


    /* === METODE === */
    public Manajer() {
        super();
    }


    public Manajer(String nama, String nik, LocalDate tanggalLahir, char jenisKelamin, double gajiPokok, double tunjanganJabatan) {
        super(nama, nik, tanggalLahir, jenisKelamin, gajiPokok);
        setPosisi("Manajer");
        setTunjanganJabatan(tunjanganJabatan);
    }


    /* === SELEKTOR === */
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }


    /* === MUTATOR === */
    public void setTunjanganJabatan(double tunjangan) {
        if (tunjangan < 0) {
            throw new IllegalArgumentException("Tunjangan jabatan tidak boleh negatif");
        }
        this.tunjanganJabatan = tunjangan;
    }


    /* === OPERATOR === */
    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + tunjanganJabatan;
    }


    @Override
    public void printInfo() {
        Locale indo = new Locale("id", "ID");
        NumberFormat Rp = NumberFormat.getCurrencyInstance(indo);


        super.printInfo();
        System.out.println("Tunjangan Jabatan: " + Rp.format(getTunjanganJabatan()));
    }
}
