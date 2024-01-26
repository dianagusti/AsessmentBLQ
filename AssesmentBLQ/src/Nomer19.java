import java.util.Scanner;

public class Nomer19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        if (isPangram(kalimat)) {
            System.out.println("Kalimat tersebut adalah pangram.");
        } else {
            System.out.println("Kalimat tersebut bukan pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String kalimat) {
        // Mengubah kalimat menjadi huruf kecil untuk memudahkan pengolahan
        kalimat = kalimat.toLowerCase();

        // Array untuk menyimpan keberadaan setiap huruf alfabet
        boolean[] alfabet = new boolean[26];

        // Memeriksa setiap karakter dalam kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            // Hanya memeriksa huruf alfabet
            if (Character.isLetter(karakter)) {
                int indeks = karakter - 'a';
                alfabet[indeks] = true;
            }
        }

        // Memeriksa apakah setiap huruf alfabet muncul setidaknya satu kali
        for (boolean hadir : alfabet) {
            if (!hadir) {
                return false; // Tidak lengkap jika ada huruf yang tidak muncul
            }
        }

        return true; // Semua huruf alfabet muncul, kalimat adalah pangram
    }
}