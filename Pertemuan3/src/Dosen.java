public class Dosen {
    /*ATRIBUT */
    private String NIP;
    private String nama;
    private String prodi;

    /*KONSTRUKTOR */
    /*Konstruktor tanpa parameter */
    public Dosen(){
        this.NIP = "" ;
        this.nama = "";
        this.prodi = "";
     }

     /*Konstruktor dengan parameter */
     public Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
     }

     /*SELEKTOR */
     String getNIPDosen(){
        return this.NIP;
     }

     String getNamaDosen(){
        return this.nama;
     }

     String getProdiDosen(){
        return this.prodi;
     }

     /*MUTATOR */
     public void setNIPDosen(String NIP){
        this.NIP = NIP;
     }

     public void setNamaDosen(String nama){
        this.nama = nama;
     }

     public void setProdiDosen(String prodi){
        this.prodi = prodi;
     }

     
}
