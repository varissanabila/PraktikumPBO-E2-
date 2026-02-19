/*  Nama File     : Titik.java
    Deskripsi: berisi atributvdan method dalam class Titik
    Pembuat: Varissa Nabila Kifli
    Tanggal: 19 Februari 2026
 */


public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    }
    
}
