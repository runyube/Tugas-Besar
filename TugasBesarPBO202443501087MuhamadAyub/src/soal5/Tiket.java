/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm, String jenisTiket,
                 double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    
    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    
    public void tampilData() {
        System.out.printf("%-11s : %s%n", "Kode Tiket", kodeTiket);
        System.out.printf("%-11s : %s%n", "Film", namaFilm);
        System.out.printf("%-11s : %s%n", "Jenis Tiket", jenisTiket);
        System.out.printf("%-11s : %.0f%n", "Harga", hargaTiket);
        System.out.printf("%-11s : %d%n", "Jumlah", jumlahTiket);
        System.out.printf("%-11s : %.0f%n", "Total", hitungTotal());
        System.out.println("-".repeat(38));
    }
}