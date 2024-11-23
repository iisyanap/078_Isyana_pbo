package library;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LibraryItem physicalBook = new PhysicalBook("PB001", "Laskar Pelangi", "Andrea Hirata", 2005);
        LibraryItem eBook = new EBook("EB001", "Bumi Manusia", "Pramoedya Ananta Toer", 1980, "PDF", 25, "https://library.com/download/EB001");

        logger.info("=== Testing Buku Fisik ===");
        physicalBook.borrowItem();
        physicalBook.displayInfo();
        physicalBook.returnItem();

        logger.info("\n=== Testing E-Book ===");
        eBook.displayInfo();
        ((DigitalContent) eBook).downloadContent();
        ((DigitalContent) eBook).streamContent();
    }
}
