import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26]; // Array untuk menyimpan frekuensi huruf
        Scanner scan = new Scanner(System.in);

        // Dapatkan input dari pengguna
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Ubah huruf menjadi huruf kapital
        word = word.toUpperCase();

        // Hitung frekuensi setiap huruf
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++; // Proses hanya huruf
            } catch (ArrayIndexOutOfBoundsException e) {
                // Tangani karakter non-huruf
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }

        // Cetak frekuensi huruf
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
