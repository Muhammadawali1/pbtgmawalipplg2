/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16part2;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Menggunakan polymorphism untuk operasi aritmatika

        // Penjumlahan
        OperasiAritmatika operasi = new Penjumlahan();
        System.out.println("Penjumlahan: " + operasi.hitung());

        // Pengurangan
        operasi = new Pengurangan();
        System.out.println("Pengurangan: " + operasi.hitung());

        // Perkalian
        operasi = new Perkalian();
        System.out.println("Perkalian: " + operasi.hitung());

        // Pembagian
        operasi = new Pembagian();
        System.out.println("Pembagian: " + operasi.hitung());
    }
}

