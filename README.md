# Dokumentasi Proyek UTS PBO - Sistem Manajemen Inventaris Gudang

**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Program Studi:** Sistem Informasi  
**Institusi:** Universitas Mulawarman  

---

## 📌 Deskripsi Proyek

Proyek ini merupakan aplikasi berbasis *Command Line Interface* (CLI) yang dikembangkan menggunakan bahasa pemrograman Java. Sistem ini dirancang untuk menyimulasikan proses pencatatan dan manajemen stok barang di sebuah gudang, meliputi operasional pendataan barang masuk dan distribusi barang keluar. 

Aplikasi ini dibangun khusus untuk memenuhi persyaratan penugasan Ujian Tengah Semester dengan mengimplementasikan prinsip-prinsip utama Pemrograman Berorientasi Objek (OOP).

### Pemenuhan Elemen Wajib OOP:
1. **Class & Object**: Penggunaan *blueprint* (Class) `Barang`, `Petugas`, dan `Transaksi` untuk merepresentasikan entitas nyata dalam alur sistem.
2. **Inheritance**: Implementasi pewarisan sifat pada *subclass* `BarangElektronik` dan `BarangMakanan` yang diturunkan langsung dari *superclass* `Barang`.
3. **Polymorphism**:
   - **Method Overriding**: Kustomisasi fungsionalitas `tampilkanInfo()` pada masing-masing *subclass* untuk menampilkan atribut spesifik (misalnya: masa garansi dan tanggal kedaluwarsa).
   - **Method Overloading**: Penyediaan ragam metode `tambahStok()` dengan parameter yang berbeda pada class `Barang` untuk memfasilitasi pencatatan transaksi masuk.
4. **Control Flow**: 
   - **Condition**: Penggunaan struktur percabangan (`if-else` dan `switch-case`) untuk memvalidasi kelayakan transaksi (seperti pengecekan defisit stok) dan navigasi menu.
   - **Looping**: Penggunaan perulangan (`while`) untuk menjaga siklus antarmuka program tetap berjalan, dan perulangan (`for`) untuk mengiterasi *array* data barang.

---

## ⚙️ Alur Program dan Petunjuk Eksekusi

### Petunjuk Eksekusi
Untuk menjalankan sistem, lakukan kompilasi pada seluruh *source code* dan jalankan *class* utama `SistemInventarisGudang.java`. Program akan secara otomatis memunculkan antarmuka menu pada terminal atau *console* IDE (seperti NetBeans).

### Cara Kerja Sistem
1. **Inisialisasi Data:** Pada saat program dijalankan, sistem secara otomatis mengalokasikan data *dummy* entitas petugas dan koleksi barang (berupa objek dari kelas turunan elektronik dan makanan) ke dalam memori menggunakan struktur data *array*.
2. **Operasi Menu Utama:** Pengguna akan disajikan empat pilihan menu operasional:
   - **Opsi 1 (Tampilkan Daftar Barang):** Sistem melakukan iterasi pada *array* barang dan mengeksekusi metode polimorfik untuk mencetak spesifikasi detail setiap barang secara terstruktur.
   - **Opsi 2 (Proses Barang Masuk):** Pengguna menginputkan indeks barang dan kuantitas suplai. Sistem akan memproses penambahan kapasitas stok pada barang yang relevan menggunakan skema *method overloading*.
   - **Opsi 3 (Proses Barang Keluar):** Pengguna menentukan indeks barang dan kuantitas yang ditarik dari gudang. Sistem akan mengevaluasi ketersediaan stok melalui kondisi *if-else*. Jika kuantitas mencukupi, stok akan direduksi secara presisi. Jika kuantitas tidak memadai, sistem akan menolak transaksi demi mencegah terjadinya stok negatif.
   - **Opsi 4 (Keluar):** Sistem memutus siklus perulangan utama (*while loop*), menutup akses *scanner*, dan melakukan terminasi program secara aman.

---

## <img width="563" height="179" alt="{6FD1DBDE-614A-463E-A605-2F87C5C48B23}" src="https://github.com/user-attachments/assets/4a379620-6052-43a9-8df3-dd1303af387a" />


**1. Output Menu Utama dan Polimorfisme (Overriding)**  
<img width="849" height="172" alt="{D1FA1D49-6E4D-43B0-90A3-84C7BBA2CFD3}" src="https://github.com/user-attachments/assets/275791ed-809f-45e3-9ea7-0e92472df20c" />

*Gambar 1: Antarmuka menu utama dan eksekusi Opsi 1. Terlihat penerapan polymorphism (method overriding) di mana atribut spesifik dari subclass (Garansi pada Elektronik dan Kedaluwarsa pada Makanan) berhasil dicetak dengan format yang berbeda.*

**2. Output Transaksi dan Polimorfisme (Overloading)**  
<img width="661" height="190" alt="{18270EE3-DE3A-4635-8CA1-B769E2C4785A}" src="https://github.com/user-attachments/assets/29854944-c223-4177-a4f8-adddb708cad2" />
<img width="661" height="190" alt="{18270EE3-DE3A-4635-8CA1-B769E2C4785A}" src="https://github.com/user-attachments/assets/9871de6e-0f2c-418b-b0ef-71142c91ef4f" />

*Gambar 2: Dokumentasi operasional pencatatan Barang Masuk (menerapkan overloading untuk melampirkan catatan histori) dan pencatatan Barang Keluar yang berhasil mereduksi jumlah stok awal.*

**3. Output Validasi Ketersediaan Stok (Control Flow: If-Else)**  
<img width="729" height="133" alt="{22D2BE74-DBC3-4272-B78C-B8607CB40AC3}" src="https://github.com/user-attachments/assets/ccca66ff-3ac0-47eb-8587-339857138e83" />

<img width="661" height="190" alt="{18270EE3-DE3A-4635-8CA1-B769E2C4785A}" src="https://github.com/user-attachments/assets/3f1561bf-4ce9-4bd8-a926-6d7f4c0ba877" />

*Gambar 3: Pengujian validasi stok pada sistem. Saat sistem menerima permintaan barang keluar yang kuantitasnya melampaui sisa stok riil, struktur kendali (if-else) akan membatalkan prosedur pengurangan stok dan menampilkan peringatan batas kuota kepada pengguna.*
