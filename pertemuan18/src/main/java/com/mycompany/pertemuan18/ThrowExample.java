/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan18;

/**
 *
 * @author user
 */
public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // Umur di bawah 18
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Umur harus 18 tahun atau lebih!");
        }
        System.out.println("Anda boleh mendaftar.");
    }
}
//Metode ini digunakan untuk melempar exception secara manual. Anda bisa membuat exception kustom atau menggunakan exception yang sudah ada,kesimpulannya Melempar exception secara manual untuk menandakan kondisi yang tidak valid..
