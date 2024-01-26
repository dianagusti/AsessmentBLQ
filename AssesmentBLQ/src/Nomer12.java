import java.util.Scanner;

public class Nomer12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        long input = scanner.nextLong();

        long hasil = urutkanDigit(input);
        System.out.println("Digit diurutkan: " + hasil);

        scanner.close();
    }

    public static long urutkanDigit(long angka) {
        // Ubah angka menjadi string untuk mempermudah manipulasi digit
        String angkaStr = Long.toString(angka);

        // Konversi string ke dalam bentuk array karakter
        char[] digitArray = angkaStr.toCharArray();

        // Urutkan digit menggunakan pendekatan bubble sort (tanpa menggunakan sort)
        int panjang = digitArray.length;
        boolean sudahDiurutkan;

        do {
            sudahDiurutkan = true;

            for (int i = 0; i < panjang - 1; i++) {
                if (digitArray[i] > digitArray[i + 1]) {
                    // Tukar digit jika digit ke-i lebih besar dari digit ke-(i+1)
                    char temp = digitArray[i];
                    digitArray[i] = digitArray[i + 1];
                    digitArray[i + 1] = temp;

                    sudahDiurutkan = false;
                }
            }
        } while (!sudahDiurutkan);

        // Konversi kembali array karakter ke dalam bentuk long
        return Long.parseLong(new String(digitArray));
    }
}