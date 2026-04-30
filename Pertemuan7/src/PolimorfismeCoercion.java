/* NIM  : 24060124140125
   Nama : Varissa Nabila Kifli
   Tgl  : 30 April 2026
*/

public class PolimorfismeCoercion {
    public static void main(String[] args) {
        // 1a & 1b. Ilustrasi Casting dan Konversi 
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt; // Polimorfisme Coercion ke char
        double nilaiDouble = (double) nilaiInt; // Coercion ke real
        int balikInt = (int) nilaiDouble; // Kembali ke integer di variabel berbeda

        System.out.println("Integer: " + nilaiInt);
        System.out.println("Karakter: " + nilaiChar); // Output: A
        System.out.println("Real: " + nilaiDouble);
        System.out.println("Kembali ke Integer: " + balikInt);

        // 1c. String Konkatenasi vs Penjumlahan Integer 
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // Konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // Penjumlahan
        System.out.println("Hasil S (String): " + S);
        System.out.println("Hasil Z (Integer): " + Z);

        // 1d. String Konkatenasi vs Penjumlahan Double 
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Hasil R (String): " + R);
        System.out.println("Hasil D (Double): " + D);

        // 1e & 1f. Konversi Lanjutan 
        try {
            // S adalah "12345678", diubah ke Integer
            Integer A = Integer.valueOf(S); 
            System.out.println("Objek Integer A: " + A);

            // A diubah kembali ke String T
            String T = A.toString();
            System.out.println("Objek String T: " + T);
        } catch (NumberFormatException e) {
            System.out.println("Error konversi: String S terlalu besar untuk Integer!");
        }
    }
}