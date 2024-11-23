package library;

import java.util.logging.Logger;

class EBook extends LibraryItem implements DigitalContent {
    private static final Logger logger = Logger.getLogger(EBook.class.getName());
    private String fileFormat;
    private int fileSizeMB;
    private int downloadCount;
    private String downloadLink;

    public EBook(String id, String title, String author, int yearPublished, String fileFormat, int fileSizeMB, String downloadLink) {
        super(id, title, author, yearPublished);
        this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;
        this.downloadCount = 0;
        this.downloadLink = downloadLink;
    }

    @Override
    public String getItemType() {
        return "E-Book";
    }

    @Override
    public int getLoanPeriod() {
        return 7;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000.0;
    }

    @Override
    public void downloadContent() {
        downloadCount++;
        logger.info(() -> String.format("Mengunduh %s dalam format %s", getTitle(), fileFormat));
        logger.info(() -> String.format("Link unduhan: %s", downloadLink));
        logger.info(() -> String.format("Total unduhan: %d", downloadCount));
    }

    @Override
    public void streamContent() {
        logger.info(() -> String.format("Streaming %s...", getTitle()));
        logger.info(() -> String.format("Ukuran file: %d MB", fileSizeMB));
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }

    public int getDownloadCount() {
        return downloadCount;
    }
}
