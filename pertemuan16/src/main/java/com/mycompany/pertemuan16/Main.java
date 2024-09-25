/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas AritmatikaImpl
        AritmatikaImpl operasi = new AritmatikaImpl();

        // Menampilkan hasil dari setiap operasi
        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        System.out.println("Pembagian: " + operasi.pembagian());
    
}
}
