package Library;

interface DigitalContent {
    void downloadContent();
    void streamContent();
    String getFileFormat();
    int getFileSizeMB();
}