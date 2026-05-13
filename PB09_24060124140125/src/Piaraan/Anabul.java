package Piaraan;

// Nama File    : Anabul.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 7 Mei

class Anabul {
    private String panggilan; // Atribut panggilan 
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // Fungsi get dan set untuk nama panggilan
    public String getNama() { 
        return panggilan; 
    }

    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public double getBobot() { 
        return bobot; 
    }
}