

import java.util.Scanner;

public class Nomer17 {
    public static void main(String[] args) {
        String jalur = "nntnnntttttnttttn";

        String[] arrJalur = jalur.split("");
        int gunung = 0;
        int lembah = 0;

        int init = 0;
        for (int i = 0; i < arrJalur.length; i++) {
            if (arrJalur[i].trim().equalsIgnoreCase("n")) {
                init = init + 1;
                if (init == 0 ) {
                    lembah += 1;
                }
            }else {
                init = init - 1;
                if(init == 0) {
                    gunung +=1;
                }
            }
        }

        System.out.println("Gunung : "+gunung);
        System.out.println("Lembah : "+lembah);
    }
}