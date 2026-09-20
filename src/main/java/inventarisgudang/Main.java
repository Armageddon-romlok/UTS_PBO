/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inventarisgudang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN INVENTARIS GUDANG ===");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Konsumsi");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Barang: ");
                    String idElek = input.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String namaElek = input.nextLine();
                    System.out.print("Masukkan Stok: ");
                    int stokElek = input.nextInt();
                    System.out.print("Masukkan Masa Garansi (Bulan): ");
                    int garansi = input.nextInt();
                    
                    BarangElektronik barangE = new BarangElektronik(idElek, namaElek, stokElek, garansi);
                    daftarBarang.add(barangE);
                    System.out.println("Barang Elektronik berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan ID Barang: ");
                    String idKons = input.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String namaKons = input.nextLine();
                    System.out.print("Masukkan Stok: ");
                    int stokKons = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Masukkan Tanggal Kedaluwarsa (DD-MM-YYYY): ");
                    String exp = input.nextLine();
                   
                    BarangKonsumsi barangK = new BarangKonsumsi(idKons, namaKons, stokKons, exp);
                    daftarBarang.add(barangK);
                    System.out.println("Barang Konsumsi berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("\n--- Daftar Barang di Gudang ---");
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Gudang masih kosong.");
                    } else {
                        for (Barang b : daftarBarang) {
                            b.tampilkanInfo(); 
                        }
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}