public class PelatihanReguler extends Pelatihan{
    // == ATRIBUT ==
    private int durasi;
    private String level;
    private String metode;

    // == KONTRUKTOR ==
    public PelatihanReguler(){
        super();
        this.durasi = 0;
        this.level = "";
        this.metode = "";
    }

    public PelatihanReguler(int durasi, String level, String metode, String kode, String nama, int kuota,  String instruktur, double harga ){
        super(kode, nama,kuota, instruktur, harga);
        this.durasi = durasi;
        this.level = level;
        this.metode =metode;
    }

    // == GETTER ==
    public int getDurasi(){return durasi;}
    public String getLevel(){return level;}
    public String getMetode(){return metode;}

    // == SETTER ==
    public void setDurasi(int durasi){this.durasi = durasi;}
    public void setLevel(String level){this.level = level;}
    public void setMode(String metode){this.metode = metode;}

    @Override
    public String getJenis() {
        return "Reguler";
    }

    // printinfo
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Durasi\t= " + getDurasi());
        System.out.println("Level\t= " + getLevel());
        System.out.println("Mode\t= " + getMetode());
    }
}


