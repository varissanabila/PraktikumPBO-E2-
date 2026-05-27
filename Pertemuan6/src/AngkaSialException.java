/**
 * File       : AngkaSialException.java
 * Deskripsi  : Exception buatan sendiri untuk angka terlarang
 */

public class AngkaSialException extends Exception {

    public AngkaSialException(int angka) {
        super("Angka " + angka + " adalah angka terlarang!!!");
    }
}