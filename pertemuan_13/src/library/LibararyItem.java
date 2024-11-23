package library; // Nama package sudah sesuai konvensi huruf kecil

import java.util.logging.Logger;

abstract class LibraryItem {
    private static final Logger logger = Logger.getLogger(LibraryItem.class.getName());

    protected String id;
    protected String title;
    protected String author;
    protected boolean isAvailable;
    protected int yearPublished;

    protected LibraryItem(String id, String title, String author, int yearPublished) { // Visibilitas diubah ke protected
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
        logger.info("\nInformasi Item:");
        logger.info(() -> "ID: " + id);
        logger.info(() -> "Judul: " + title);
        logger.info(() -> "Penulis: " + author);
        logger.info(() -> "Tahun Terbit: " + yearPublished);
        logger.info(() -> "Tipe: " + getItemType());
        logger.info(() -> "Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
    }

    public String gettitle() {
        return title;
    }
}