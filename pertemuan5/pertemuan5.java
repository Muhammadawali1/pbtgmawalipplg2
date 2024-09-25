/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan5;

import java.util.Scanner; // Impor scanner

/**
 *
 * @author user
 */
public class pertemuan5 {

    public static void main(String[] args) {

        try ( // Membuat objek Scanner untuk menerima input dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            String nama, alamat, gaji;
            int usia;

            System.out.println("## Pendataan Karyawan PT. Petani Kode ##");
            System.out.print("Masukkan Nama Karyawan: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Alamat Karyawan: ");
            alamat = scanner.nextLine();
            System.out.print("Masukkan Usia Karyawan: ");
            usia = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi newline
            System.out.print("Masukkan Gaji Karyawan: ");
            gaji = scanner.nextLine();

            System.out.println("\n## Pendataan Karyawan PT. Petani Kode ##");
            System.out.println("Nama Karyawan    : " + nama);
            System.out.println("Alamat Karyawan  : " + alamat);
            System.out.println( "Usia Karyawan    : "+usia );
            System.out.println("Gaji Karyawan    : " + gaji);

        }
    }
}
