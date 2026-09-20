/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarisgudang;

public class BarangKonsumsi extends Barang {
    private String tanggalKedaluwarsa;

    public BarangKonsumsi(String idBarang, String namaBarang, int stok, String tanggalKedaluwarsa) {
        super(idBarang, namaBarang, stok);
        this.tanggalKedaluwarsa = tanggalKedaluwarsa;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | Nama: " + namaBarang + 
                           " | Stok: " + stok + " | Exp: " + tanggalKedaluwarsa + " (Konsumsi)");
    }
}