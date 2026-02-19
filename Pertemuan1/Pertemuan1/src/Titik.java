/*  Nama File     : Titik.java
    Deskripsi: berisi atributvdan method dalam class Titik
    Pembuat: Varissa Nabila Kifli
    Tanggal: 19 Februari 2026
 */

public class Titik {
    /************************ATRIBUT************************ */
    double absis;
    double ordinat;

    /************************METHOD************************ */
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setAbsis(double x) {
        absis = x;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    
// End class Titik
}
