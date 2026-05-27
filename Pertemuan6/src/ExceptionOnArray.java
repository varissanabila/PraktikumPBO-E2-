/**
 * File       : ExceptionOnArray.java
 * Deskripsi  : Program penggunaan eksepsi menggunakan class library
 */

public class ExceptionOnArray {
    public static void main(String[] args) {

        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // ini akan error (index out of bounds)
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}