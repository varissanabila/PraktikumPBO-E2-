import java.time.LocalDate;

public class Dosen extends Pegawai{
    // atribut
    protected String Fakultas;

    // konstruktor 
    public Dosen(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas){
        super(NIP, Nama, TL, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    // Selektor
    public String getFakultas(){
        return Fakultas;
    }

    // Mutator
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

     @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas : " + getFakultas());
    }

}
