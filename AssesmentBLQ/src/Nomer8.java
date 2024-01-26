public class Nomer8 {

    public static void main(String[] args) {
        int[] deret = {1, 2, 4, 7, 8, 6, 9};

        int jumlah = hitungJumlahDeret(deret);
        int maksimal = cariNilaiMaksimal(deret);
        int minimal = cariNilaiMinimal(deret);

        System.out.println("Deret: " + arrayToString(deret));
        System.out.println("Jumlah deret: " + jumlah);
        System.out.println("Nilai maksimal: " + maksimal);
        System.out.println("Nilai minimal: " + minimal);
    }

    public static int hitungJumlahDeret(int[] deret) {
        int jumlah = 0;
        for (int nilai : deret) {
            jumlah += nilai;
        }
        return jumlah;
    }

    public static int cariNilaiMaksimal(int[] deret) {
        int maksimal = Integer.MIN_VALUE;
        for (int nilai : deret) {
            if (nilai > maksimal) {
                maksimal = nilai;
            }
        }
        return maksimal;
    }

    public static int cariNilaiMinimal(int[] deret) {
        int minimal = Integer.MAX_VALUE;
        for (int nilai : deret) {
            if (nilai < minimal) {
                minimal = nilai;
            }
        }
        return minimal;
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}