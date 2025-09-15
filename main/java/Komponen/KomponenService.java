
package Komponen;
import java.util.ArrayList;

public class KomponenService {
    private ArrayList<Komponen> daftarKomponen = new ArrayList<>();

    // CREATE
    public void tambahKomponen(Komponen k) {
        daftarKomponen.add(k);
        System.out.println("Komponen berhasil ditambahkan!");
    }

    // READ
    public void lihatKomponen() {
        if (daftarKomponen.isEmpty()) {
            System.out.println("Daftar komponen kosong.");
        } else {
            System.out.println("=== Daftar Komponen ===");
            for (int i = 0; i < daftarKomponen.size(); i++) {
                System.out.println((i + 1) + ". " + daftarKomponen.get(i));
            }
        }
    }

    // UPDATE
    public void updateKomponen(int index, Komponen k) {
        if (index >= 0 && index < daftarKomponen.size()) {
            daftarKomponen.set(index, k);
            System.out.println("Komponen berhasil diupdate!");
        } else {
            System.out.println("Nomor komponen tidak valid.");
        }
    }

    // DELETE
    public void hapusKomponen(int index) {
        if (index >= 0 && index < daftarKomponen.size()) {
            daftarKomponen.remove(index);
            System.out.println("Komponen berhasil dihapus!");
        } else {
            System.out.println("Nomor komponen tidak valid.");
        }
    }

    // HITUNG TOTAL
    public void hitungTotalHarga() {
        double total = 0;
        for (Komponen k : daftarKomponen) {
            total += k.getHarga();
        }
        System.out.println("Total harga semua komponen: Rp" + String.format("%,.2f", total));
    }

   
}
