public class Nomer5 {

    public static void main(String[] args) {
        int n = 10; // Ganti nilai n sesuai kebutuhan

        System.out.println("Menampilkan " + n + " bilangan Fibonacci pertama:");
        tampilkanFibonacci(n);
    }

    public static void tampilkanFibonacci(int n) {
        int angkaSebelumnya = 0;
        int angkaSekarang = 1;

        System.out.print(angkaSebelumnya + " " + angkaSekarang + " ");

        for (int i = 2; i < n; i++) {
            int angkaBerikutnya = angkaSebelumnya + angkaSekarang;
            System.out.print(angkaBerikutnya + " ");

            angkaSebelumnya = angkaSekarang;
            angkaSekarang = angkaBerikutnya;
        }
    }
}