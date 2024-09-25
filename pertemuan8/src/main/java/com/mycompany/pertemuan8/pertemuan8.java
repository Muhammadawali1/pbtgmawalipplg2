/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class pertemuan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai awal dan nilai akhir
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = input.nextInt();
        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = input.nextInt();

        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi");
        System.out.println("Pemrograman Berorientasi Objek (Java 1) 104");
        System.out.println("Sistem Informasi S-1");
        System.out.println("Hasil nya :");

        // Loop untuk menampilkan bilangan dengan pertambahan 5
        int counter = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(counter + ". " + i);
            counter++;
        }
    }
}
