/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarisgudang;

public class BarangElektronik extends Barang {
    private int masaGaransi;

    public BarangElektronik(String idBarang, String namaBarang, int stok, int masaGaransi) {
        super(idBarang, namaBarang, stok);
        this.masaGaransi = masaGaransi;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + idBarang + " | Nama: " + namaBarang + 
                           " | Stok: " + stok + " | Garansi: " + masaGaransi + " bulan (Elektronik)");
    }
}
