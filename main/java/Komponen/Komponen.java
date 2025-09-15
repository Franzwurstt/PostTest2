package Komponen;
public class Komponen {
    private String nama;
    private double harga;
    private String kategori;

    // Constructor
    public Komponen(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    @Override
    public String toString() {
        return nama + " | Rp" + String.format("%,.2f", harga) + " | Kategori: " + kategori;
    }
}