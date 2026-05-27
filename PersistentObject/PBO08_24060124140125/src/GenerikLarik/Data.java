package GenerikLarik;

// Nama File    : Data.java
// NIM          : 24060124140125
// Nama         : Varissa Nabila Kifli
// Tanggal      : 6 May 2026

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return ruang[pos - 1];
        }
        return null;
    }

    public void setIsi(int pos, T obj) {
        if (pos >= 1 && pos <= 100) {
            if (ruang[pos - 1] == null && obj != null) {
                banyak++;
            } else if (ruang[pos - 1] != null && obj == null) {
                banyak--;
            }
            ruang[pos - 1] = obj;
        }
    }

    public int getSize() {
        return banyak;
    }
}
