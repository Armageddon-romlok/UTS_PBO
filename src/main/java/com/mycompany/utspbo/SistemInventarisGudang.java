/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspbo;

import java.util.Scanner;

public class SistemInventarisGudang {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Petugas petugas1 = new Petugas("P001", "Budi Santoso");
            Barang[] daftarBarang = new Barang[2];
            daftarBarang[0] = new BarangElektronik("E01", "Laptop Asus", 10, 12);
            daftarBarang[1] = new BarangMakanan("M01", "Beras Maknyus", 50, "12-12-2027");
            
            boolean berjalan = true;
            
            while (berjalan) {
                System.out.println("\n=== SISTEM MANAJEMEN INVENTARIS GUDANG ===");
                System.out.println("1. Tampilkan Daftar Barang");
                System.out.println("2. Proses Barang Masuk");
                System.out.println("3. Proses Barang Keluar");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                int pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.println("\n-- Daftar Barang di Gudang --");
                        for (Barang daftarBarang1 : daftarBarang) {
                            daftarBarang1.tampilkanInfo();
                        }
                    }

                    case 2, 3 -> {
                        String jenisTx = (pilihan == 2) ? "MASUK" : "KELUAR";
                        System.out.print("Masukkan Indeks Barang (0 = Laptop, 1 = Beras): ");
                        int idx = scanner.nextInt();
                        
                        if(idx >= 0 && idx < daftarBarang.length) {
                            System.out.print("Masukkan jumlah barang: ");
                            int jumlah = scanner.nextInt();
                            Transaksi tx = new Transaksi(petugas1, daftarBarang[idx], jenisTx, jumlah);
                            tx.prosesTransaksi();
                        } else {
                            System.out.println("Indeks barang tidak ditemukan!");
                        }
                    }
                    case 4 -> {
                        berjalan = false;
                        System.out.println("Sistem ditutup. Terima kasih!");
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }
}