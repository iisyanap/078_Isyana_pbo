package Library;

abstract class LibraryItem {
    protected String id;
    protected String title;
    protected String author;
    protected boolean isAvailable;
    protected int yearPublished;

    public LibraryItem(String id, String title, String author, int yearPublished) {
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
            System.out.println(title + " telah dipinjam.");
            System.out.println("Periode peminjaman: " + getLoanPeriod() + " hari");
        } else {
            System.out.println(title + " sedang tidak tersedia.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " telah dikembalikan.");
        } else {
            System.out.println(title + " sudah ada di perpustakaan.");
        }
    }

    public void displayInfo() {
        System.out.println("\nInformasi Item:");
        System.out.println("ID: " + id);
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Tahun Terbit: " + yearPublished);
        System.out.println("Tipe: " + getItemType());
        System.out.println("Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
    }
}
