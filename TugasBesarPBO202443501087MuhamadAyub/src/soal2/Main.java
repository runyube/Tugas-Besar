/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package soal2;

public class Main {
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda("S01", "Sepeda Gunung", 3, 15000);
        Sepeda s2 = new Sepeda("S02", "Sepeda Lipat", 2, 10000);

        s1.tampilData();
        s2.tampilData();
    }
}