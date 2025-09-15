# PostTest2

Nama: Prakasa Wira Mukti
Nim: 2409116054
Tema: Manajemen Daftar Harga Komponen Komputer

Deskripsi Program

Program ini dibuat untuk orang orang seperti pemilik toko komputer, teknisi, atau orang orang yang ingin merakit komputer untuk mencatat harga dari komponen yang ingin mereka beli, sehingga mereka bisa mempertimbangkan terlebih dahulu sebelum membeli. Disini pengguna dapat menambahkan komponen baru beserta harganya, melihat daftar komponen yang sudah tersimpan, memperbarui data komponen, serta menghapus data komponen yang tidak diperlukan.

-Struktur program dibagi menjadi 3 bagian:

Main (Main.java) untuk menjalankan menu utama & menerima input user.
Model (KomponenService.java) untuk mengelola logika CRUD & penyimpanan data.
Model (Komponen.java) untuk merepresentasikan data komponen.

-Penjelasan Alur Program

Main.java (Titik Awal Program)

Program dimulai dari class Main.
Di sini terdapat menu utama dan loop untuk terus menerima input user sampai memilih keluar.

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    KomponenService service = new KomponenService();
    int pilihan;

    do {
        System.out.println("*** Daftar Harga Komponen Komputer ***");
        System.out.println("1. Buat List Komponen");
        System.out.println("2. Lihat List Komponen");
        System.out.println("3. Update List Komponen");
        System.out.println("4. Hapus List Komponen");
        System.out.println("5. Hitung Total Harga Komponen");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");

        pilihan = input.nextInt();
        input.nextLine();


Peran Main:

Menampilkan pilihan menu.
Membaca input user dengan Scanner.
Meneruskan input tersebut ke KomponenService.

-Pilihan Menu di Main

Setiap input user akan dieksekusi melalui switch case.

1. Tambah Komponen
case 1:
    System.out.print("Masukkan nama komponen: ");
    String nama = input.nextLine();
    System.out.print("Masukkan harga komponen: ");
    double harga = input.nextDouble();
    input.nextLine();
    System.out.print("Masukkan kategori: ");
    String kategori = input.nextLine();

    service.tambahKomponen(new Komponen(nama, harga, kategori));
    break;


Membuat objek baru Komponen, lalu memanggil tambahKomponen() dari KomponenService.

2. Lihat Komponen
case 2:
    service.lihatKomponen();
    break;

Memanggil lihatKomponen() untuk menampilkan daftar yang tersimpan.

3. Update Komponen
case 3:
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

    service.updateKomponen(update - 1, new Komponen(namabaru, hargabaru, kategoribaru));
    break;

Mengganti data lama dengan objek baru.

4. Hapus Komponen
case 4:
    System.out.print("Masukkan nomor komponen yang ingin dihapus: ");
    int hapus = input.nextInt();
    input.nextLine();
    service.hapusKomponen(hapus - 1);
    break;

Menghapus data dari daftar berdasarkan index.

5. Hitung Total Harga
case 5:
    service.hitungTotalHarga();
    break;

Menjumlahkan seluruh harga komponen.

6. Keluar
case 6:
    System.out.println("Babay");
    break;

Mengakhiri loop, program berhenti.

Class KomponenService.java 

Semua logika CRUD ditangani di sini. Data disimpan di ArrayList.

private ArrayList<Komponen> daftarKomponen = new ArrayList<>();

Untuk Tambah Data

public void tambahKomponen(Komponen k) {
    daftarKomponen.add(k);
    System.out.println("Komponen berhasil ditambahkan!");
}


Untuk Lihat Data

public void lihatKomponen() {
    if (daftarKomponen.isEmpty()) {
        System.out.println("Daftar kosong.");
    } else {
        for (int i = 0; i < daftarKomponen.size(); i++) {
            Komponen k = daftarKomponen.get(i);
            System.out.println((i+1) + ". " + k.getNama() +
                " | Harga: Rp" + String.format("%,.2f", k.getHarga()) +
                " | Kategori: " + k.getKategori());
        }
    }
}


Untuk Update Data

public void updateKomponen(int index, Komponen k) {
    if (index >= 0 && index < daftarKomponen.size()) {
        daftarKomponen.set(index, k);
        System.out.println("Komponen berhasil diupdate!");
    } else {
        System.out.println("Nomor tidak valid.");
    }
}


Untuk Hapus Data

public void hapusKomponen(int index) {
    if (index >= 0 && index < daftarKomponen.size()) {
        daftarKomponen.remove(index);
        System.out.println("Komponen berhasil dihapus!");
    } else {
        System.out.println("Nomor tidak valid.");
    }
}


Untuk Hitung Total Harga

public void hitungTotalHarga() {
    double total = 0;
    for (Komponen k : daftarKomponen) {
        total += k.getHarga();
    }
    System.out.println("Total harga semua komponen: Rp" + String.format("%,.2f", total));
}

Komponen.java (Model / Struktur Data)

Merepresentasikan komponen dengan property dan constructor.

public class Komponen {
    private String nama;
    private double harga;
    private String kategori;

    public Komponen(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Getter
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public String getKategori() { return kategori; }
}


Setiap kali user menambah data, objek baru Komponen dibuat dari class ini.

3. Simulasi Jalannya Program

User pilih menu 1  Tambah  memasukkan "RAM, 500000, Hardware".
Main membuat objek  KomponenService menyimpannya di ArrayList.

User pilih menu 2  Lihat daftar menampilkan "RAM".

User pilih menu 3  Update ubah RAM jadi "RAM DDR4".

User pilih menu 5  Hitung Total tampil "Rp 500.000".

User pilih menu 6  Keluar program selesai.
