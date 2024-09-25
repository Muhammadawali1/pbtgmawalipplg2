/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11part2;

/**
 *
 * @author user
 */


import java.util.Scanner;

class Karyawan {
    String idKaryawan;
    String namaKaryawan;
    String golongan;
    String jabatan;
    double gajiPokok;

    // Constructor dengan parameter
    public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

public class pertemuan11part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ID Karyawan
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = scanner.nextLine();

        // Input Nama Karyawan
        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();

        // Input Golongan
        System.out.print("Masukkan Golongan bre: ");
        String golongan = scanner.nextLine();

        // Variabel untuk jabatan dan gaji pokok
        String jabatan = "";
        double gajiPokok = 0.0;

        // Menentukan jabatan dan gaji pokok berdasarkan golongan
        switch (golongan) {
            case "1" -> {
                jabatan = "Assisten Staff";
                gajiPokok = 3000000.00;
            }
            case "2" -> {
                jabatan = "Staff";
                gajiPokok = 3500000.00;
            }
            case "3" -> {
                jabatan = "Supervisor";
                gajiPokok = 4000000.00;
            }
            case "4" -> {
                jabatan = "Assisten Manager";
                gajiPokok = 5000000.00;
            }
            case "5" -> {
                jabatan = "Manager";
                gajiPokok = 6000000.00;
            }
            default -> {
                System.out.println("Golongan tidak valid!");
                return;
            }
        }

        // Membuat objek karyawan menggunakan constructor dengan parameter
        Karyawan karyawan1 = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);

        // Menampilkan data karyawan
        karyawan1.tampilkanData();
    }
}
