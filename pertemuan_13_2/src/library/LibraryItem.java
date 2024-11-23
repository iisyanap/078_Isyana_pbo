package library;

import java.util.logging.Logger;

abstract class LibraryItem {
    private static final Logger logger = Logger.getLogger(LibraryItem.class.getName());

    protected String id;
    protected String title;
    protected String author;
    protected boolean isAvailable;
    protected int yearPublished;

    protected LibraryItem(String id, String title, String author, int yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public abstract String getItemType();
    public abstract int getLoanPeriod();
    public abstract double calculateLateFee(int daysLate);

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            logger.info(() -> title + " telah dipinjam.");
            logger.info(() -> "Periode peminjaman: " + getLoanPeriod() + " hari");
        } else {
            logger.warning(() -> title + " sedang tidak tersedia.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            logger.info(() -> title + " telah dikembalikan.");
        } else {
            logger.warning(() -> title + " sudah ada di perpustakaan.");
        }
    }

    public void displayInfo() {
        logger.info(() -> String.format("ID: %s", id));
        logger.info(() -> String.format("Judul: %s", title));
        logger.info(() -> String.format("Penulis: %s", author));
        logger.info(() -> String.format("Tahun Terbit: %d", yearPublished));
        logger.info(() -> String.format("Tipe: %s", getItemType()));
        logger.info(() -> String.format("Status: %s", isAvailable ? "Tersedia" : "Dipinjam"));
    }

    public String getTitle() {
        return title;
    }
}
