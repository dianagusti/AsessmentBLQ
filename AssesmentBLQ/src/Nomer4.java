public class Nomer4 {

    public static void main(String[] args) {
        int n = 10; // Ganti nilai n sesuai kebutuhan

        System.out.println("Menampilkan " + n + " bilangan prima pertama:");
        tampilkanBilanganPrima(n);
    }

    public static void tampilkanBilanganPrima(int n) {
        int jumlahPrima = 0;
        int angka = 2; // Dimulai dari 2, karena 2 adalah bilangan prima pertama

        while (jumlahPrima < n) {
            if (isPrima(angka)) {
                System.out.print(angka + " ");
                jumlahPrima++;
            }
            angka++;
        }
    }

    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }
}