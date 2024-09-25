/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan4part2;

/**
 *
 * @author user
 */
public class pertemuan4part2 {

    public static void main(String[] args) {
        int w, x, y, z;

        x = 6;
        w = 5;
        y = 8 - x++;
        z = 8 - ++w;
        // Menampilkan hasil
        System.out.println("Nilai x = " + x); // x akan menjadi 7 setelah operasi post-increment
        System.out.println("Nilai w = " + w); // w akan menjadi 6 setelah operasi pre-increment
        System.out.println("Nilai y = " + y); // y = 8 - 6 = 2 (menggunakan nilai x sebelum increment)
        System.out.println("Nilai z = " + z); // z = 8 - 6 = 2 (menggunakan nilai w setelah increment)
    }
}

