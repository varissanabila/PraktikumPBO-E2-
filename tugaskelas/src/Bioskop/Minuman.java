
/* Nama File : Minuman.java
 * Deskripsi : Berisi atribut dan method dalam class Minuman
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;

public class Minuman extends Produk{
    /* ATRIBUT */
    private String jenisMinuman;
    private boolean dingin;
    private static final double PAJAK_MINUMAN = 0.10;
    private static int counterMnm = 0;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Minuman(){
        super();
        this.jenisMinuman = "";
        this.dingin = false;
        counterMnm++;
    }

    // Konstruktor dengan parameter
    public Minuman(String id, String nama, String ukuran, double harga, int stok, String jenisMinuman, Boolean dingin){
        super(id, nama, ukuran, harga, stok);
        this.jenisMinuman = jenisMinuman;
        this.dingin = dingin;
        counterMnm++;
    }

    // Selektor
    public String getJenisMinuman(){
        return jenisMinuman;
    }

    public boolean isDingin(){
        return dingin;
    }

    public static int getCounterMnm(){
        return counterMnm;
    }

    // Mutator
    public void setJenisMinuman(String jenisMinuman){
        this.jenisMinuman = jenisMinuman;
    }

    public void setDingin (boolean dingin){
        this.dingin = dingin;
    }

    // Operator
    // Method override hitungPajak dengan pajak Minuman 10%
    @Override
    public double hitungPajak(){
        return PAJAK_MINUMAN * getHarga();
    }

    // Method override cetakInfo()
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jenis Minuman\t: " + getJenisMinuman());
        if (dingin) {
            System.out.println("Status Minuman\t: Dingin");
        } else {
            System.out.println("Status Minuman\t: Hangat");
        }
    }
}

