import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nomer15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu (format hh:mm:ss a): ");
        String waktuAwal = scanner.nextLine();

        String waktuAkhir = konversiFormatWaktu(waktuAwal);

        System.out.println("Waktu awal: " + waktuAwal);
        System.out.println("Waktu akhir: " + waktuAkhir);

        scanner.close();
    }

    public static String konversiFormatWaktu(String waktuAwal) {
        SimpleDateFormat formatAwal = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat formatAkhir = new SimpleDateFormat("HH:mm:ss");

        try {
            // Parse waktu awal
            Date date = formatAwal.parse(waktuAwal);

            // Format ulang ke waktu akhir
            return formatAkhir.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Jika terjadi kesalahan, kembalikan waktu awal
        return waktuAwal;
    }
}