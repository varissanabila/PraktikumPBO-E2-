// Nama File    : Teman.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 7 Mei

import java.util.ArrayList;
import java.util.List;

public class Teman {
    // Atribut untuk menyimpan jumlah elemen dan daftar nama 
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor: Menginstansiasi list saat objek dibuat 
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a.
    public int getNbelm(){
        return this.nbelm;
    }

    // b.
    public String getNama (int indeks){
        return this.Lnama.get(indeks);
    }

    // c.
    public void setNama(int idx, String nama) {
        this.Lnama.set(idx, nama);
    }

    // d.
    public void addNama(String nama){
        this.Lnama.add(nama);
        this.nbelm ++;
    }

    // e.
    public void delNama(String nama){
        this.Lnama.remove(nama);
        this.nbelm --;
    }

    // f.
    public boolean isMember (String nama) {
        return this.Lnama.contains(nama);
    }

    // g.
    public boolean gantiNama(String nama, String namabaru) {
        int idx = this.Lnama.indexOf(nama);
        if (idx != -1){
            this.Lnama.set(idx, namabaru);
            return true;
        }
        return false;
    }

    // h. 
    public int countNama(String nama){
    int count =0;
    for(String n: this.Lnama){
        if (n.equals(nama)){
            count++;
        }
    }
    return count;
}

    // i.
    public void showTeman() {
        System.out.println("Daftar Teman:");

        for(String nama : this.Lnama) {
            System.out.println(nama);
        }
    }

    
}
