import java.time.LocalDate;

public class Pegawai {
    /* ATRIBUT */
    protected String NIP;
    protected String Nama;
    protected LocalDate TL;
    protected LocalDate TMT;
    protected double GajiPokok;

    /* KONSTRUKTOR DENGAN PARAMETER */
    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TL = TL;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    /* SELEKTOR */
    public String NIP(){
        return NIP;
    }

    public String Nama(){
        return Nama;
    }

    public LocalDate TL(){
        return TL;
    }

    public LocalDate TMT(){
        return TMT;
    }

    public double GajiPokok(){
        return GajiPokok;
    }

    /* MUTATOR */
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTL(LocalDate TL){
        this.TL = TL;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

}
