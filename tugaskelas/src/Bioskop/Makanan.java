/* Nama File : Makanan.java
 * Deskripsi : Berisi atribut dan method dalam class Makanan
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;

public class Makanan extends Produk{
    /* ATRIBUT */
    private String jenisMakanan;
    private String rasaMakanan;
    private static final double PAJAK_MAKANAN = 0.15;
    private static int counterMkn = 0;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Makanan(){
        super();
        this.jenisMakanan = "";
        this.rasaMakanan = "";
        counterMkn++;
    }

    // Konstruktor dengan parameter
     public Makanan(String id, String nama, String ukuran, double harga, int stok, String jenisMakanan, String rasaMakanan){
        super(id, nama, ukuran, harga, stok);
        this.jenisMakanan = jenisMakanan;
        this.rasaMakanan = rasaMakanan;
        counterMkn++;
    }

    // Selektor
    public String getJenisMakanan(){
        return jenisMakanan;
    }

    public String getRasaMakanan(){
        return rasaMakanan;
    }

    public static int getCounterMkn(){
        return counterMkn;
    }

    // Mutator
    public void setJenisMakanan(String jenisMakanan){
        this.jenisMakanan = jenisMakanan;
    }

    public void setRasaMakanan(String rasaMakanan){
        this.rasaMakanan = rasaMakanan;
    }

    // Operator
    // Method override hitungPajak dengan pajak Makanan 15%
    @Override
    public double hitungPajak(){
        return PAJAK_MAKANAN * getHarga();
    }

    // Method override cetakInfo()
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jenis Makanan\t: " + getJenisMakanan());
        System.out.println("Rasa Makanan\t: " + getRasaMakanan());
    }
}

