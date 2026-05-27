/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : Varissa Nabila Kifli
 * Tanggal      : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        
        T1.setAbsis(3);         // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // Mencetak koordinat T1 ke layar

        T1.geser(3, 4);         // Menggeser T1 sejauh (3,4)
        T1.printTitik();  
        Titik T2 = T1;
        T2.printTitik();
                           // Menampilkan koordinat T1 setelah digeser
Titik t1 = new Titik();
        t1.setAbsis(3);
        t1.setOrdinat(4);

        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());

        System.out.println("Kuadran: " + t1.getKuadran());

        System.out.println("Jarak ke pusat (0,0): " + t1.getJarakPusat());

        System.out.println("Jarak ke titik (1,1): " + t1.getJarak(1,1));

        // Refleksi X 
        t1.refleksiX();
        System.out.println("Setelah refleksi X:");
        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());

        // Refleksi Y 
        t1.refleksiY();
        System.out.println("Setelah refleksi Y:");
        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());

        // Refleksi pakai objek baru
        Titik t2 = t1.getrefleksiX();
        System.out.println("Refleksi X (objek baru): ");
        System.out.println("Absis: " + t2.getAbsis());
        System.out.println("Ordinat: " + t2.getOrdinat());

        Titik t3 = t1.getrefleksiY();
        System.out.println("Refleksi Y (objek baru): ");
        System.out.println("Absis: " + t3.getAbsis());
        System.out.println("Ordinat: " + t3.getOrdinat());
    }
}