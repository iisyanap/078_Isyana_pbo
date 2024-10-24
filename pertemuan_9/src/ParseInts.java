import java.util.Scanner;

public class ParseInts {

    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Baca satu baris teks
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Parsing integer dari setiap token
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Mencoba parsing integer
                sum += val;
            } catch (NumberFormatException e) {
                // Jika token bukan angka, abaikan
                System.out.println("Bukan angka, diabaikan." + e.getMessage());
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
