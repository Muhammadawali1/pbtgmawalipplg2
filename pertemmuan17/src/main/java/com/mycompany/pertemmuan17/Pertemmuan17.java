/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemmuan17;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Pertemmuan17 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah kota
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();  // Untuk menangkap newline setelah input angka

        // Membuat array untuk menyimpan nama-nama kota
        String[] kota = new String[jumlahKota];

        // Meminta input nama-nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }

        // Menampilkan kota-kota yang dimasukkan
        System.out.println("Kota-kota yang dimasukkan:");
        for (int i = 0; i < kota.length; i++) {
            System.out.println(kota[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}