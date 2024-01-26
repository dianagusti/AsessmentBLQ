

import java.util.Scanner;

public class Nomer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input :");
        String in = scanner.nextLine();
        int x = Math.abs(in.length() / 2);

        for (int i = 0; i < in.length(); i++) {
            String w = "";
            for (int j = 0; j < (x * 2) + 1; j++) {
                if (j == x) {
                    w = w + String.valueOf(in.charAt(i));
                } else {
                    w = w + "*";
                }
            }
            System.out.println(w);
        }
    }
}