/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarisgudang;

public class Barang {
    protected String idBarang;
    protected String namaBarang;
    protected int stok;

    public Barang(String idBarang, String namaBarang, int stok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | Nama: " + namaBarang + " | Stok: " + stok);
    }
}
