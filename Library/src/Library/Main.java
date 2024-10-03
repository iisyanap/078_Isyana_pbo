package Library;

public class Main {
    public static void main(String[] args) {
        // Membuat instance buku fisik
        PhysicalBook physicalBook = new PhysicalBook(
            "PB001", 
            "Laskar Pelangi", 
            "Andrea Hirata", 
            2005,
            "9789793062792",
            "Rak A-123",
            "Baik"
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

        // Testing Physical Book
        System.out.println("=== Testing Buku Fisik ===");
        physicalBook.displayInfo();
        System.out.println("\n= Reservasi =");
        physicalBook.borrowItem();
        physicalBook.makeReservation("MEM001");
        System.out.println("Denda keterlambatan 5 hari: Rp" + 
                          physicalBook.calculateLateFee(5));
        physicalBook.returnItem();

        // Testing E-Book
        System.out.println("\n=== Testing E-Book ===");
        eBook.displayInfo();
        System.out.println("\n= Reservasi =");
        eBook.borrowItem();
        eBook.downloadContent();
        eBook.streamContent();
        System.out.println("Denda keterlambatan 5 hari: Rp" + 
                          eBook.calculateLateFee(5));

        // Demonstrasi polymorphism
        System.out.println("\n=== Testing Polymorphism ===");
        LibraryItem[] items = {physicalBook, eBook};
        for (LibraryItem item : items) {
            System.out.println("\nTipe item: " + item.getItemType());
            System.out.println("Periode peminjaman: " + item.getLoanPeriod() + " hari");
        }
    }
}