/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

public class BarangMakanan extends Barang {
    private String tanggalKedaluwarsa;

    public BarangMakanan(String id, String nama, int stok, String tanggalKedaluwarsa) {
        super(id, nama, stok);
        this.tanggalKedaluwarsa = tanggalKedaluwarsa;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | [Makanan] " + namaBarang + " | Stok: " + stok + " | Expired: " + tanggalKedaluwarsa);
    }
}