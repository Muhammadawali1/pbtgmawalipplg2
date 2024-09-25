/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11;

/**
 *
 * @author user
 */
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

    // Method buat nampilin data karyawan
    public void tampilkanData() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

public class pertemuan11 {
    public static void main(String[] args) {
        //isi data karyawan menggunakan construct dengan parameter kira kir begitu
        Karyawan karyawan1 = new Karyawan("K00121", "Awali", "o", "Progamer", 750000.000);

        // buat nampilin data karyawan
        karyawan1.tampilkanData();
    }
}
