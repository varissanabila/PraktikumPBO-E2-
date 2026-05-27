public class Persegi extends BangunDatar
{
    private double sisi;

    public Persegi()
    {
        super();
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border)
    {
        // Memanggil konstruktor berparameter milik kelas induk (Bagian 2)
        super(4, warna, border); 
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi()
    {
        return sisi;
    }

    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }

    public double getLuas()
    {
        return sisi * sisi;
    }

    public double getKeliling()
    {
        return 4 * sisi;
    }

    public double getDiagonal()
    {
        return sisi * Math.sqrt(2);
    }

    // Overriding method printInfo (Bagian 3)
    @Override
    public void printInfo()
    {
        super.printInfo(); // Memanggil printInfo() asli milik BangunDatar
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
