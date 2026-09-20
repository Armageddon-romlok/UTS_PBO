Tugas PBO - Sistem Manajemen Inventaris Gudang

Nama: Risky farel wijaya

NIM 2509116066

Program Studi: Sistem Informasi, Fakultas Teknik, Universitas Mulawarman


PEnjelasan studi kasus

Program ini adalah Sistem Manajemen Inventaris Barang Gudang berbasis CLI (Command Line Interface). Sistem ini bertujuan untuk mendata barang-barang yang masuk ke dalam gudang. Karena barang gudang memiliki karakteristik yang berbeda-beda, sistem membaginya ke dalam kategori spesifik untuk memudahkan pencatatan, seperti barang elektronik yang butuh catatan garansi, dan barang konsumsi yang butuh catatan kedaluwarsa.



Hiearki class

Sistem ini menggunakan struktur hierarki Inheritance dengan satu kelas induk dan dua kelas anak:

Barang (Super-class)

└── BarangElektronik (Sub-class)

└── BarangKonsumsi (Sub-class)


Penerapan Inheritance

Penerapan inheritance pada program ini bertujuan untuk menghindari duplikasi kode pada atribut dasar barang. Berikut adalah detail penerapannya:

Super-class (Barang.java): Menyimpan atribut dasar yang pasti dimiliki oleh semua barang di gudang, yaitu idBarang, namaBarang, dan stok. Class ini juga memiliki fungsi tampilkanInfo().

Penggunaan Keyword extends: Pada class BarangElektronik dan BarangKonsumsi, digunakan keyword extends Barang yang menandakan bahwa kedua class tersebut adalah sub-class dan mewarisi seluruh atribut dari class Barang.

Penggunaan super(): Di dalam constructor setiap sub-class, program memanggil super(idBarang, namaBarang, stok) untuk mengirimkan nilai atribut dasar ke super-class, lalu sub-class hanya tinggal memproses atribut tambahannya sendiri (seperti masaGaransi untuk elektronik).

Method Overriding: Kedua sub-class menulis ulang (override) method tampilkanInfo() milik super-class agar saat dicetak, informasi spesifik seperti garansi dan tanggal kedaluwarsa ikut ditampilkan.


Running program

<img width="423" height="129" alt="{C0D4CE7A-FE13-4A66-A27B-BAAB9824B315}" src="https://github.com/user-attachments/assets/02643bf2-611f-472e-a6a4-a999b7cc8e90" />

Tampilan Menu Utama (CLI): Menampilkan antarmuka konsol saat program pertama kali dijalankan (running), yang memuat opsi menu untuk menambah barang elektronik, menambah barang konsumsi, menampilkan daftar barang, dan keluar dari aplikasi. Tangkapan layar ini berfungsi sebagai bukti running program pada bagian awal dokumentasi README.md.

<img width="442" height="138" alt="{89A1C61B-40AA-415F-BF0E-430D08AB5EAB}" src="https://github.com/user-attachments/assets/51ddf28e-2b90-48b3-a2fd-728c526cb75a" />
<img width="505" height="147" alt="{E859B4F6-40DB-4CFD-8E29-6B1DAE050A63}" src="https://github.com/user-attachments/assets/cbff99ca-dcaa-4192-a688-1a90d02eb6ef" />
<img width="706" height="115" alt="{DFE09277-E63C-4D43-A179-46993E15B8FB}" src="https://github.com/user-attachments/assets/bf4bedb0-9006-4625-b907-0fb2bba108da" />
