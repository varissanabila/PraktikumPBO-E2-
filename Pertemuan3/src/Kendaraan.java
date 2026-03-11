public class Kendaraan {
    /*ATRIBUT */
    private String noPlat;
    private String jenis;
    
    /*KONSTRUKTOR */
    /*Konstruktor tanpa parameter */
    public Kendaraan(){
        this.noPlat= "";
        this.jenis = "";
    }

    /*Konstruktor dengan parameter */
    public Kendaraan(String noPlat, String jenis){
        this.noPlat= noPlat;
        this.jenis = jenis;
    }

    /*SELEKTOR */
    String getnoPlatKendaraan(){
        return this.noPlat;
    }

    String getJenisKendaraan(){
        return this.jenis;
    }

    /*MUTATOR */
    public void setnoPlatKendaraan(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenisKendaraan(String jenis){
        this.jenis = jenis;
    }
    
}
