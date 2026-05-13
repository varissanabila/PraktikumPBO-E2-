/* Nama File : Kursi.java
 * Deskripsi : Berisi atribut dan method dalam class Kursi
 */


package Bioskop;


public class Kursi {
    /* === ATRIBUT === */
    private String nomorKursi;
    private boolean isTersedia;


    /* === METODE === */
    public Kursi() {
        this.nomorKursi = "";
        this.isTersedia = true;
    }


    public Kursi(String nomorKursi) {
        setNomorKursi(nomorKursi);
        this.isTersedia = true;
    }


    /* === SELEKTOR === */
    public String getNomorKursi() {
        return nomorKursi;
    }


    public boolean isTersedia() {
        return isTersedia;
    }


    /* === MUTATOR === */
    public void setNomorKursi(String nomorKursi) {
        if (nomorKursi == null || nomorKursi.isEmpty()) {
            throw new IllegalArgumentException("Nomor kursi tidak boleh kosong");
        }
        this.nomorKursi = nomorKursi;
    }


    public void setTersedia(boolean tersedia) {
        isTersedia = tersedia;
    }


    public void printInfo() {
        System.out.println("Nomor Kursi: " + nomorKursi + " [" + (isTersedia ? "Tersedia" : "Terisi") + "]");
    }
}
