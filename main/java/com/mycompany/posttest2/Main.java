package com.mycompany.posttest2;

import Komponen.Komponen;
import Komponen.KomponenService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KomponenService service = new KomponenService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n*** Daftar Harga Komponen Komputer ***");
            System.out.println("1. Buat List Komponen");
            System.out.println("2. Lihat List Komponen");
            System.out.println("3. Update List Komponen");
            System.out.println("4. Hapus List Komponen");
            System.out.println("5. Hitung Total Harga Komponen");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama komponen: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan harga komponen: ");
                    double harga = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan kategori komponen: ");
                    String kategori = input.nextLine();

                    Komponen k = new Komponen(nama, harga, kategori);
                    service.tambahKomponen(k);
                    break;

                case 2:
                    service.lihatKomponen();
                    break;

                case 3:
                    service.lihatKomponen();
                    System.out.print("Masukkan nomor komponen yang ingin diupdate: ");
                    int update = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan nama baru: ");
                    String namabaru = input.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double hargabaru = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan kategori baru: ");
                    String kategoribaru = input.nextLine();

                    Komponen baru = new Komponen(namabaru, hargabaru, kategoribaru);
                    service.updateKomponen(update - 1, baru);
                    break;

                case 4:
                    service.lihatKomponen();
                    System.out.print("Masukkan nomor komponen yang ingin dihapus: ");
                    int hapus = input.nextInt();
                    input.nextLine();
                    service.hapusKomponen(hapus - 1);
                    break;

                case 5:
                    service.hitungTotalHarga();
                    break;

                case 6:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }
}
