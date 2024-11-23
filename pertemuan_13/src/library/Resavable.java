package library;

interface Reservable {
    void makeReservation(String memberId);
    void cancelReservation(String memberId);
    boolean isReserved();
    String getReservedBy();
}