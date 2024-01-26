

import java.util.Scanner;

public class Nomer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input (hh:mm) : ");
        String in = scanner.nextLine();

        String[] n = in.split(":");

        int jam = Integer.parseInt(n[0].trim());
        int menit = Integer.parseInt(n[1].trim());

        double sudut = sudutTerkecil(jam, menit);
        System.out.println("Sudut terkecil dalah " + sudut + " derajat");
    }

    static double sudutTerkecil(int jam, int menit) {
        jam = jam % 12;
        double jarumJam = (jam * 30) + (menit * 0.5);
        double jarumMenit = menit * 6;
        double dif = Math.abs(jarumJam - jarumMenit);
        double sudutTerkecil = Math.min(dif, 360 - dif);

        return sudutTerkecil;
    }
}