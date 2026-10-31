/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class Main {
    public static void main(String[] args) {
      
        Menu menuDefault = new Menu();
        System.out.println("=== Opsi 1: Constructor tanpa parameter ===");
        menuDefault.tampilMenu();

        System.out.println();

        
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        int jumlah = 2;

        System.out.println("=== Opsi 2: Constructor dengan parameter ===");
        System.out.println("Ekspektasi Output Kasir");
        menu1.tampilMenu();
        System.out.println("Jumlah : " + jumlah);
        System.out.printf("Total  : %.0f%n", menu1.hitungHarga(jumlah));
    }
}