package Service;
import model.Komponen;
import java.util.ArrayList;

public class KomponenService {
    private ArrayList<Komponen> listKomponen = new ArrayList<>();

    public void tambahKomponen(Komponen k) {
        listKomponen.add(k);
        System.out.println("Komponen berhasil ditambahkan.");
    }

    public void lihatKomponen() {
        if (listKomponen.isEmpty()) {
            System.out.println("Belum ada komponen.");
        } else {
            for (int i = 0; i < listKomponen.size(); i++) {
                Komponen k = listKomponen.get(i);
                System.out.println((i + 1) + ". " + k.getNama() +
                                   " | Rp" + k.getHarga() +
                                   " | " + k.getKategori());
            }
        }
    }

    public void updateKomponen(int index, Komponen baru) {
        if (index >= 0 && index < listKomponen.size()) {
            listKomponen.set(index, baru);
            System.out.println("Komponen berhasil diupdate.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusKomponen(int index) {
        if (index >= 0 && index < listKomponen.size()) {
            listKomponen.remove(index);
            System.out.println("Komponen berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hitungTotalHarga() {
        double total = 0;
        for (Komponen k : listKomponen) {
            total += k.getHarga();
        }
        System.out.println("Total harga semua komponen: Rp" + total);
    }
}
