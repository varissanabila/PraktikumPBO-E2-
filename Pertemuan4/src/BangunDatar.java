public class BangunDatar
{
    // Menggunakan protected agar bisa diakses langsung oleh kelas turunannya (Bagian 4)
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0; // Menghitung jumlah objek

    // Konstruktor default
    public BangunDatar()
    {
        counterBangunDatar++;
    }

    // Konstruktor berparameter (Bagian 2)
    public BangunDatar(int jmlSisi, String warna, String border)
    {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter & Setter
    public int getJmlSisi()
    {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna()
    {
        return warna;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }
    
    public String getBorder()
    {
        return border;
    }

    public void setBorder(String border)
    {
        this.border = border;
    }

    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar()
    {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
