package Library;

class EBook extends LibraryItem implements DigitalContent {
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
        System.out.println("Mengunduh " + title + " dalam format " + fileFormat);
        System.out.println("Link unduhan: " + downloadLink);
        System.out.println("Total unduhan: " + downloadCount);
    }

    @Override
    public void streamContent() {
        System.out.println("Streaming " + title + "...");
        System.out.println("Ukuran file: " + fileSizeMB + "MB");
    }

    @Override
    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public int getFileSizeMB() {
        return fileSizeMB;
    }
}
