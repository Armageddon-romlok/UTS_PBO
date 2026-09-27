/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

public class Transaksi {
    private Petugas petugas;
    private Barang barang;
    private String jenis;
    private int jumlah;

    public Transaksi(Petugas petugas, Barang barang, String jenis, int jumlah) {
        this.petugas = petugas;
        this.barang = barang;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public void prosesTransaksi() {
        System.out.println("\n--- Memproses Transaksi oleh: " + petugas.getNama() + " ---");
        
        if (jenis.equalsIgnoreCase("MASUK")) {
            barang.tambahStok(jumlah, "Transaksi Masuk");
        } else if (jenis.equalsIgnoreCase("KELUAR")) {
            boolean sukses = barang.kurangiStok(jumlah);
            if(sukses) {
                System.out.println("Barang keluar berhasil dicatat. Sisa stok diperbarui.");
            }
        } else {
            System.out.println("Jenis transaksi tidak valid!");
        }
    }
}
