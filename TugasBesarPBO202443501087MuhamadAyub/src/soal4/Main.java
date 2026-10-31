/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<Pemeriksaan> daftar = new ArrayList<>();

        
        daftar.add(new Pemeriksaan("P01", "Budi", "dr. Ani", 150000));
        daftar.add(new Pemeriksaan("P02", "Siti", "dr. Rudi", 200000));
        daftar.add(new Pemeriksaan("P03", "Joko", "dr. Ani", 175000));

       
        double totalSemua = 0;
        for (Pemeriksaan p : daftar) {
            p.tampilData();
            totalSemua += p.hitungTotal();
        }

        System.out.printf("Total Seluruh Biaya : %.0f%n", totalSemua);
    }
}