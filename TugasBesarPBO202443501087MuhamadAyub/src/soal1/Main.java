/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package soal1;
 
public class Main {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("B01", "Matematika", "Muhamad Ayub", 85000);
        Buku buku2 = new Buku("B02", "Pemograman Berorientasi Objek", "Prabowo", 120000);
 
       
        buku1.tampilData();
        buku2.tampilData();
    }
}