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
