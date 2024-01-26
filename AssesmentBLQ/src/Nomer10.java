

import java.util.Scanner;

public class Nomer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input :");
        String in = scanner.nextLine();

        String[] arrIn = in.split(" ");

        String newWord = "";

        for (int i = 0; i < arrIn.length; i++) {
            String s = arrIn[i].trim();
            String ns = "";

            for (int j = 0; j < s.length(); j++) {
                String t1 = "";
                String t2 = "";
                String t3 = "";

                if(j==0) {
                    t1 = String.valueOf(s.charAt(j));
                    ns = ns + t1;
                }else if(j == s.length()-1) {
                    t2 = String.valueOf(s.charAt(j));
                    ns = ns + t2;
                }else {
                    t3 = "*";
                    ns = ns + t3;

                }

            }

            newWord = newWord + " " + ns;
        }

        System.out.println(newWord.trim());
    }
}