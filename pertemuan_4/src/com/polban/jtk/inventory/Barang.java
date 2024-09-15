package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    // Getter dan Setter
    public String getKodeBarang() {
        return kode_barang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }

    // Hanya metode ini yang diizinkan untuk mengubah stok
    public void tambahStok(int tambahan) {
        if (tambahan > 0) {
            this.stok += tambahan;
        }
    }
}
