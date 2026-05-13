public class Pelatihan {
    // == ATRIBUT ==
    protected String kode;
    protected String nama;
    protected int kuota;
    protected String instruktur;
    protected double harga;
    protected static double pajak = 0.15;
    
    //== KONSTRUKTOR ==
    public Pelatihan()
    {
        this.kode = "";
        this.nama = "";
        this.kuota = 0;
        this.instruktur = "";
        this.harga = 0.0;
    }
    // overload
    public Pelatihan(String kode, String nama, int kuota,  String instruktur, double harga)
    {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.instruktur = instruktur;
        this.harga = harga;
    }

    // == GETTER ==
    public String getKode(){return kode;}
    public String getNama(){return nama;}
    public int getKuota(){return kuota;}
    public String getInstruktur(){return instruktur;}
    public double getHarga(){return harga;}
    public static double getPajak(){return pajak;}

    // == SETTER ==
    public void setKode(String kode){this.kode = kode;}
    public void setNama(String nama){this.nama= nama;}
    public void setKuota(int kuota){this.kuota = kuota;}
    public void setInstruktur(String instruktur){this.instruktur = instruktur;}
    public void setHarga(double harga){this.harga = harga;}
    
    // == METHOD ==
    // hitung harga akhir setelah kena pajak
    public double hitungHarga()
    {
        return getHarga()+(getPajak()*getHarga());
    }
    //overload
        public double hitungHarga(double diskon)
    {
        return getHarga()-(diskon*getHarga())+ (getPajak()*getHarga());
    }

    // jenis, karena masih di parent makanya blm diketahui
    public String getJenis()
    {
        return "Blm ada";
    }

    // printinfo
    public void printInfo(){
        System.out.println("Kode\t= " + getKode());
        System.out.println("Nama\t= " + getNama());
        System.out.println("Jenis\t= " + getJenis());
        System.out.println("Kuota\t= " + getKuota());
        System.out.println("Harga\t= " + getHarga());
        System.out.println("Pajak\t= " + getPajak());
        System.out.println("Harga akhir setelah pajak\t= " + hitungHarga());
    }
}
