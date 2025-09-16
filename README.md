# PostTest2

**Nama: Prakasa Wira Mukti**

**Nim: 2409116054**

**Tema: Manajemen Daftar Harga Komponen Komputer**

---

## Deskripsi Program

Program ini dibuat untuk orang orang seperti pemilik toko komputer, teknisi, atau orang orang yang ingin merakit komputer untuk mencatat harga dari komponen yang ingin mereka beli, sehingga mereka bisa mempertimbangkan terlebih dahulu sebelum membeli. Disini pengguna dapat menambahkan komponen baru beserta harganya, melihat daftar komponen yang sudah tersimpan, memperbarui data komponen, serta menghapus data komponen yang tidak diperlukan.

---

### Struktur program dibagi menjadi 3 bagian:

Main (Main.java) untuk menjalankan menu utama & menerima input user.

Service (KomponenService.java) untuk mengelola logika CRUD & penyimpanan data.

Model (Komponen.java) untuk merepresentasikan data komponen.

## Penjelasan Alur Program

Main.java (Titik Awal Program)

Program dimulai dari class Main.
Di sini terdapat menu utama dan loop untuk terus menerima input user sampai memilih keluar.

<img width="484" height="326" alt="image" src="https://github.com/user-attachments/assets/30fe9572-dfe5-4a79-8a7a-aa8d2fb57695" />

### Peran Main:

Menampilkan pilihan menu.
Membaca input user dengan Scanner.
Meneruskan input tersebut ke KomponenService.

- Pilihan Menu di Main

Setiap input user akan dieksekusi melalui switch case.

1. Tambah Komponen
<img width="356" height="179" alt="image" src="https://github.com/user-attachments/assets/ee848621-d84e-410a-9f08-68588db55e18" />

Membuat objek baru Komponen, lalu memanggil tambahKomponen() dari KomponenService.

2. Lihat Komponen
<img width="185" height="49" alt="image" src="https://github.com/user-attachments/assets/5e390350-1f72-4ae8-bcfe-b4dbbb366157" />

Memanggil lihatKomponen() untuk menampilkan daftar yang tersimpan.

3. Update Komponen
<img width="428" height="233" alt="image" src="https://github.com/user-attachments/assets/72d92447-e6af-42f5-8e71-5121c2a49412" />

Update data lama dengan yang baru.

4. Hapus Komponen
<img width="428" height="100" alt="image" src="https://github.com/user-attachments/assets/1aa7549e-a68a-4c17-8528-358ef70bc99f" />

Menghapus data dari daftar berdasarkan index.

5. Hitung Total Harga
   
<img width="215" height="49" alt="image" src="https://github.com/user-attachments/assets/b06dbbb6-cdc6-4cb9-9f36-64538a0eeeb2" />

Menjumlahkan seluruh harga komponen.

6. Keluar
7. 
<img width="343" height="57" alt="image" src="https://github.com/user-attachments/assets/e0ba29fb-993a-4981-a1ef-febf70691112" />

Mengakhiri loop, program berhenti.

### Class KomponenService.java 

Semua logika CRUD ditangani di sini. Data disimpan di ArrayList.

<img width="166" height="19" alt="image" src="https://github.com/user-attachments/assets/c662773c-3f73-4f4e-832a-802d9babebc7" />

Untuk Tambah Data

<img width="361" height="64" alt="image" src="https://github.com/user-attachments/assets/6c1206a0-1c4b-4eb1-b46b-142db9adf9a1" />

Untuk Lihat Data

<img width="373" height="164" alt="image" src="https://github.com/user-attachments/assets/e2d37452-c5c6-4a08-beef-7526f5c9c713" />

Untuk Update Data

<img width="356" height="107" alt="image" src="https://github.com/user-attachments/assets/f3d50ea9-0251-4330-a5bd-2587935d35c0" />

Untuk Hapus Data

<img width="356" height="107" alt="image" src="https://github.com/user-attachments/assets/b257b220-74cf-4be1-bbf7-bc2ae7237c7a" />

Untuk Hitung Total Harga

<img width="404" height="101" alt="image" src="https://github.com/user-attachments/assets/7c181091-5967-4e55-8689-ddf3c1ae5798" />

Komponen.java (Model / Struktur Data)

Merepresentasikan komponen dengan property dan constructor.

<img width="384" height="128" alt="image" src="https://github.com/user-attachments/assets/65adcb4c-a531-46df-a841-b496ef1b0f62" />

Setiap kali user menambah data, objek baru Komponen dibuat dari class ini.

<img width="467" height="66" alt="image" src="https://github.com/user-attachments/assets/788596dc-bba8-4997-93a6-6ebf472f6d94" />

mengubah data di dalam objek

### Output

Menu


User pilih menu 1  Tambah  memasukkan "RAM, 500000, Hardware".
Main membuat objek  KomponenService menyimpannya di ArrayList.

<img width="280" height="197" alt="image" src="https://github.com/user-attachments/assets/6807a624-13c8-4182-9127-6130eaf22818" />


User pilih menu 2  Lihat daftar menampilkan "RAM".

<img width="307" height="181" alt="image" src="https://github.com/user-attachments/assets/a511820c-7aa6-4ac1-bfd4-2ab4c5bb796c" />

User pilih menu 3  Update ubah RAM jadi "RAM DDR4".

<img width="325" height="253" alt="image" src="https://github.com/user-attachments/assets/6f18372d-25ba-4784-bca6-4d73bbba7c76" />

User pilih menu 4

<img width="317" height="206" alt="image" src="https://github.com/user-attachments/assets/d233413e-3c3d-4142-b8c4-ebe313a5fdf7" />


User pilih menu 5  Hitung Total tampil "Rp 500.000".

<img width="275" height="154" alt="image" src="https://github.com/user-attachments/assets/81263d89-46d8-443e-8ed8-5dd98bd7128e" />


User pilih menu 6  Keluar program selesai.
