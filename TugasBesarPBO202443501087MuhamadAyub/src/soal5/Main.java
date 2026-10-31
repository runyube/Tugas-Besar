/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("T01", "Avengers", "Reguler", 50000, 2));
        daftarTiket.add(new Tiket("T02", "Frozen", "VIP", 80000, 3));
        daftarTiket.add(new Tiket("T03", "Batman", "Reguler", 50000, 1));

       
        System.out.println("=".repeat(38));
        System.out.println("        DATA PEMESANAN TIKET");
        System.out.println("=".repeat(38));

      
        for (Tiket t : daftarTiket) {
            t.tampilData();
        }
    }
}