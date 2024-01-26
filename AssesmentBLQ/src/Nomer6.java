import java.util.Scanner;

public class Nomer6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.nextLine();

        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String kata) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        String cleanedKata = kata.replaceAll("\\s", "").toLowerCase();

        int panjang = cleanedKata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (cleanedKata.charAt(i) != cleanedKata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}