/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

public class Barang {
    protected String idBarang;
    protected String namaBarang;
    protected int stok;

    public Barang(String idBarang, String namaBarang, int stok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
        System.out.println("Stok " + namaBarang + " berhasil ditambah sebanyak " + jumlah);
    }

    public void tambahStok(int jumlah, String catatan) {
        this.stok += jumlah;
        System.out.println("Stok " + namaBarang + " ditambah " + jumlah + " (" + catatan + ")");
    }

    public boolean kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            return true;
        } else {
            System.out.println("Gagal! Stok " + namaBarang + " tidak mencukupi. Sisa stok: " + this.stok);
            return false;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | Nama: " + namaBarang + " | Stok: " + stok);
    }
}
