/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13part2;

/**
 *
 * @author user
 */
public class pertemuan13part2 {

    // Method untuk menghitung luas segitiga dengan parameter alas dan tinggi
    double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Method untuk menghitung luas segitiga dengan parameter alas, tinggi, dan luas yang diberikan
    double hitungLuas(double alas, double tinggi, double luas) {
        // Anda bisa melakukan validasi atau operasi tambahan jika diperlukan
        return luas;
    }

    // Main method
    public static void main(String[] args) {
        // Buat instance dari LuasSegitiga
        pertemuan13part2 segitiga = new  pertemuan13part2 ();

        // Inisialisasi alas dan tinggi
        double alas = 10;
        double tinggi = 5;

        // Hitung luas menggunakan metode pertama
        double luas1 = segitiga.hitungLuas(alas, tinggi);
        System.out.println("Luas Segitiga (menggunakan alas dan tinggi): " + luas1);

        // Hitung luas menggunakan metode kedua (dengan luas yang diberikan)
        double luas2 = segitiga.hitungLuas(alas, tinggi, luas1);
        System.out.println("Luas Segitiga (dengan luas yang diberikan): " + luas2);
    }
}

















