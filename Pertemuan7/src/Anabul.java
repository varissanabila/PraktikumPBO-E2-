
/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/
// Parent Class
class Anabul {
    public void suara() {
        System.out.println("Anabul bersuara...");
    }
    public void gerak() {
        System.out.println("Anabul bergerak...");
    }
}

// Kelas Anak: Kucing
class Kucing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Kucing: Meong");
    }
    @Override
    public void gerak() {
        System.out.println("Kucing: Bergerak dengan melata.");
    }
}

// Kelas Anak: Anjing
class Anjing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Anjing: Guk-guk");
    }
    @Override
    public void gerak() {
        System.out.println("Anjing: Bergerak dengan melata.");
    }
}

// Kelas Anak: Burung
class Burung extends Anabul {
    @Override
    public void suara() {
        System.out.println("Burung: Cuit");
    }
    @Override
    public void gerak() {
        System.out.println("Burung: Bergerak dengan terbang.");
    }
}
