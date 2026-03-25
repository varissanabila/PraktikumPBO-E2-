/**
 * File : Petani.java
 * deskripsi : Program untuk class Petani
 * nama : Varissa Nabila Kifli 24060124140125
 * tanggal : 25 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    private static final int C = 1; 

    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String kota){
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = kota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public double hitungPajak(){
        return 0; 
    }

    @Override
    public int hitungMasaKerja(){
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + C;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
