package library;

import java.util.logging.Logger;

class EBook extends LibraryItem implements DigitalContent {
    private static final Logger logger = Logger.getLogger(EBook.class.getName());
    private String fileFormat;
    private int fileSizeMB;
    private int downloadCount;
    private String downloadLink;

    public EBook(String id, String title, String author, int yearPublished,
                 String fileFormat, int fileSizeMB, String downloadLink) {
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
        logger.info("Mengunduh " + gettitle() + " dalam format " + fileFormat);
        logger.info("Link unduhan: " + downloadLink);
        logger.info("Total unduhan: " + downloadCount);
    }

    @Override
    public void streamContent() {
        logger.info("Streaming " + gettitle() + "...");
        logger.info("Ukuran file: " + fileSizeMB + "MB");
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }
}