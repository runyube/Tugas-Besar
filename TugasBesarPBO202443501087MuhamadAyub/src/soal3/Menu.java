/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package soal3;
 
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;
 
    
    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0;
        this.kategori = "-";
    }
 
    
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }
 
    
    public void tampilMenu() {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.printf("Harga  : %.0f%n", harga);
    }
 
  
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}