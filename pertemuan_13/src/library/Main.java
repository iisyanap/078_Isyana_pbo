package library;

public class Main {
    public static void main(String[] args) {
        // Membuat instance buku fisik
        PhysicalBook physicalBook = new PhysicalBook(
            "PB001",
            "Laskar Pelangi",
            "Andrea Hirata",
            2005
        );

        // Membuat instance e-book
        EBook eBook = new EBook(
            "EB001",
            "Bumi Manusia",
            "Pramoedya Ananta Toer",
            1980,
            "PDF",
            25,
            "https://library.com/download/EB001"
        );

        // Testing Buku Fisik
        System.out.println("=== Testing Buku Fisik ===");
        physicalBook.borrowItem();
        physicalBook.displayInfo();
        physicalBook.returnItem();

        // Testing E-Book
        System.out.println("\n=== Testing E-Book ===");
        eBook.downloadContent();
        eBook.streamContent();
        eBook.displayInfo();
    }
}