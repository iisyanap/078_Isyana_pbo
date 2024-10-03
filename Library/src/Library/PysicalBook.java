package Library;

class PhysicalBook extends LibraryItem implements Reservable {
    private String isbn;
    private String location;
    private String condition;
    private String reservedBy;

    public PhysicalBook(String id, String title, String author, int yearPublished,
                       String isbn, String location, String condition) {
        super(id, title, author, yearPublished);
        this.isbn = isbn;
        this.location = location;
        this.condition = condition;
        this.reservedBy = null;
    }

    @Override
    public String getItemType() {
        return "Buku Fisik";
    }

    @Override
    public int getLoanPeriod() {
        return 14;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000.0;
    }

    @Override
    public void makeReservation(String memberId) {
        if (!isReserved() && !isAvailable) {
            reservedBy = memberId;
            System.out.println("Buku berhasil direservasi untuk member " + memberId);
        } else if (isAvailable) {
            System.out.println("Buku tersedia untuk dipinjam langsung");
        } else {
            System.out.println("Buku sudah direservasi oleh member lain");
        }
    }

    @Override
    public void cancelReservation(String memberId) {
        if (isReserved() && reservedBy.equals(memberId)) {
            reservedBy = null;
            System.out.println("Reservasi dibatalkan");
        } else {
            System.out.println("Tidak ada reservasi aktif untuk dibatalkan");
        }
    }

    @Override
    public boolean isReserved() {
        return reservedBy != null;
    }

    @Override
    public String getReservedBy() {
        return reservedBy;
    }
}