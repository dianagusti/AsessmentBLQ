import java.util.Scanner;

public class Nomer9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        tampilkanKelipatanPenambahan(n);

        scanner.close();
    }

    public static void tampilkanKelipatanPenambahan(int n) {
        System.out.println("Kelipatan penambahan dari " + n + " adalah:");

        for (int i = 1; i <= 5; i++) {
            int kelipatan = n * i;
            System.out.println("Kelipatan ke-" + i + ": " + kelipatan);
        }
    }
}