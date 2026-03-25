/**
 * File : Pengusaha.java
 * deskripsi : Program untuk class Pengusaha
 * nama : Varissa Nabila Kifli 24060124140125
 * tanggal : 25 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    private static final int B = 2; 

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp){
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + B;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}