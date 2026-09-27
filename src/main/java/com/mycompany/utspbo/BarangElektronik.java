/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

public class BarangElektronik extends Barang {
    private final int garansiBulan;

    public BarangElektronik(String id, String nama, int stok, int garansiBulan) {
        super(id, nama, stok);
        this.garansiBulan = garansiBulan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | [Elektronik] " + namaBarang + " | Stok: " + stok + " | Garansi: " + garansiBulan + " Bulan");
    }
}