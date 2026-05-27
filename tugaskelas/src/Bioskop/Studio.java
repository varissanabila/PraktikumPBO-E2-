/* Nama File : Studio.java
 * Deskripsi : Berisi atribut dan method dalam class Studio
 * Tanggal   : 28 Maret 2026
 */

package Bioskop;
import java.util.ArrayList;

public class Studio {
    // ATRIBUT
    private String idStudio;
    private String jenisStudio;
    private int kapasitas;
    private ArrayList<String> daftarKursi;

    // KONSTRUKTOR TANPA PARAMETER
    public Studio()
    {
        this.idStudio = "";
        this.jenisStudio = "";
        this.kapasitas = 0;
        this.daftarKursi = new ArrayList<>();
        generateKursi();
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Studio(String idStudio, String jenisStudio, int kapasitas) {
        setIdStudio(idStudio);
        setJenisStudio(jenisStudio);
        setKapasitas(kapasitas);
        this.daftarKursi = new ArrayList<>();
        generateKursi();
    }
    // SELEKTOR
    public String getIdStudio()
    {
        return idStudio;
    }
    public String getJenisStudio()
    {
        return jenisStudio;
    }
    public int getKapasitas()
    {
        return kapasitas;
    }
    public ArrayList<String> getDaftarKursi()
    {
        return daftarKursi;
    }

    // MUTATOR
    public void setIdStudio(String idStudio)
    {
        if (idStudio == null || idStudio.isEmpty()){
            throw new IllegalArgumentException("ID Studio tidak boleh kosong atau null");
        }
        this.idStudio = idStudio;
    }
    public void setJenisStudio(String jenisStudio)
    {
        if (jenisStudio == null || jenisStudio.isEmpty()){
            throw new IllegalArgumentException("Jenis studio tidak boleh kosong atau null");
        }
        this.jenisStudio = jenisStudio;
    }
    public void setKapasitas(int kapasitas)
    {
        if (kapasitas<=0){
            throw new IllegalArgumentException("Kapasitas harus lebih dari 0");
        }
        this.kapasitas = kapasitas;
    }
    
    // METHOD
    // generate kursi otomatis
    private void generateKursi()
    {
        for (int i=1; i<= kapasitas; i++){
            daftarKursi.add("K" + i);
        }
    }
    // printinfo
    public void printInfo()
    {
        System.out.println("== STUDIO ==");
        System.out.println("ID\t: " + idStudio);
        System.out.println("Jenis Studio\t: " + jenisStudio);
        System.out.println("Kapasitas\t: " + kapasitas);
    }

    @Override
    public String toString() {
        return jenisStudio + " (" + idStudio + ")";
    }
    
}
