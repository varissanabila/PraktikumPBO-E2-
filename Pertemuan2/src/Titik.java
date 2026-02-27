/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Varissa Nabila Kifli
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    /**************** ATRIBUT ******************/
    double absis;
    double ordinat;

    /**************** METHOD ******************/
    
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran() {
        if (getAbsis()>0 && getOrdinat()>0) return 1;
        else if (getAbsis()>0 && getOrdinat()<0) return 2;
        else if (getAbsis()<0 && getOrdinat()>0) return 3;
        else if (getAbsis()<0 && getOrdinat()>0) return 4;
        return 0;
    }

    double getJarakPusat(){
        return Math.sqrt((Math.pow(getAbsis(),2) + Math.pow(getOrdinat(), 2)));
    }

    double getJarak(double x, double y){
        return Math.sqrt(Math.pow(getAbsis()-x, 2) + Math.pow(getOrdinat()-y, 2));
    }

    void refleksiX(){
        absis= -absis;
    }

    void refleksiY(){
        ordinat= -ordinat;
    }

    Titik getrefleksiX(){
        Titik T1= new Titik();
        T1.setOrdinat(absis);
        T1.setAbsis(-1*absis);
        return T1;
    }

    Titik getrefleksiY(){
        Titik T1= new Titik();
        T1.setOrdinat(absis);
        T1.setAbsis(-1*absis);
        return T1;
        }



} // end class Titik