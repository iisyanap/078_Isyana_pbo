package library;

import java.util.logging.Logger;

class PhysicalBook extends LibraryItem implements Reservable {
    private static final Logger logger = Logger.getLogger(PhysicalBook.class.getName());
    private String reservedBy;

    public PhysicalBook(String id, String title, String author, int yearPublished) {
        super(id, title, author, yearPublished);
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
            logger.info("Buku berhasil direservasi untuk member " + memberId);
        } else if (isAvailable) {
            logger.info("Buku tersedia untuk dipinjam langsung");
        } else {
            logger.warning("Buku sudah direservasi oleh member lain");
        }
    }

    @Override
    public void cancelReservation(String memberId) {
        if (isReserved() && reservedBy.equals(memberId)) {
            reservedBy = null;
            logger.info("Reservasi dibatalkan");
        } else {
            logger.warning("Tidak ada reservasi aktif untuk dibatalkan");
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