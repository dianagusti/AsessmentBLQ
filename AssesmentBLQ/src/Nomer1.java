

import java.util.Scanner;

public class Nomer1 {
    public static void main(String[] args) {
        // harga
        int[] kacaMata = { 500, 600, 700, 800 };
        int[] baju = { 200, 400, 350 };
        int[] sepatu = { 400, 350, 200, 300 };
        int[] buku = { 100, 50, 150 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah Uang : ");
        int uang = scanner.nextInt();
        scanner.nextLine();


        int count = 0;

        for (int i = 0; i < kacaMata.length; i++) {
            for (int j = 0; j < baju.length; j++) {
                for (int k = 0; k < sepatu.length; k++) {
                    for (int l = 0; l < buku.length; l++) {
                        int sisa = uang;
                        int item = 0;
                        sisa = sisa - kacaMata[i] ;
                        if (sisa >= 0) {
                            item += 1;

                            sisa = sisa - baju[j];
                            if(sisa >=0) {
                                item += 1;

                                sisa = sisa - sepatu[k];
                                if(sisa>=0) {
                                    item += 1;

                                    sisa = sisa - buku[l];
                                    if(sisa>=0) {
                                        item += 1;

                                    }
                                }
                            }
                        }
                        if(item>count) {
                            count = item;
                        }
                    }
                }
            }
        }
        System.out.println("Jumlah Item Yang Bisa Dibeli : "+count);

    }
}