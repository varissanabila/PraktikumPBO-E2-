/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 *                Relasi: 
 *                - Mahasiswa → MataKuliah : Agregasi (◇────)
 *                - Mahasiswa → Kendaraan  : Komposisi (◆────)
 *                - Mahasiswa → Dosen      : Agregasi (◇────)
 * Pembuat      : Varissa Nabila Kifli 24060124140125
 * Tanggal      : 11 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /********** ATRIBUT **********/
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**** KONSTRUKTOR ****/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<> ();
    }
    // Konstruktor dengan parameter
    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    /*SELEKTOR */
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }


    /*MUTATOR */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    //Agregasi
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /*METHOD */
    //printMhs
    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //menambahkan matkul
    public void addMatkul(MataKuliah newMatKul) {
        this.listMatKul.add(newMatKul);
    }

    //menampilkan jumlah SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            totalSKS += listMatKul.get(i).getSKSMahasiswa();
        }
        return totalSKS;
    }
    

    //getJumlahMatKul()
    public int getJumlahMatkul() {
        return this.listMatKul.size();
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + NIM);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatKul.get(i).getNamaMataKuliah());
        }
    }
}

