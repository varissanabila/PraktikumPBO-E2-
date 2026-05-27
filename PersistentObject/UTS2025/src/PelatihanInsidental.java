import java.time.LocalDate;
public class PelatihanInsidental extends Pelatihan {
   // == ATRIBUT ==
    private LocalDate tanggal;
    private String mode;

    // == KONTRUKTOR ==
    public PelatihanInsidental(){
        super();
        this.tanggal = LocalDate.now();
        this.mode = "";
    }

    public PelatihanInsidental(LocalDate tanggal, String mode,  String kode, String nama, int kuota,  String instruktur, double harga ){
        super(kode, nama,kuota, instruktur, harga);
        this.tanggal = tanggal;
        this.mode = mode;
    }

    // == GETTER ==
    public LocalDate getTanggal(){return tanggal;}
    public String getMode(){return mode;}

    // == SETTER ==
    public void setTanggal(LocalDate tanggal){this.tanggal = tanggal;}
    public void setMode(String mode){this.mode = mode;}

    @Override
    public String getJenis() {
        return "Insidental";
    }
    // printinfo
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tanggal\t= " + getTanggal());
        System.out.println("Mode\t= " + getMode());
    }
}




    

