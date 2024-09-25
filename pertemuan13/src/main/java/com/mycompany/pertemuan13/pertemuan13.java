/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13;

/**
 *
 * @author user
 */
public class pertemuan13 {

    // Parent class
    class Calculator {
        // Method untuk penjumlahan
        int add(int a, int b) {
            return a + b;
        }

        // Method untuk pengurangan
        int subtract(int a, int b) {
            return a - b;
        }

        // Method untuk perkalian
        int multiply(int a, int b) {
            return a * b;
        }

        // Method untuk pembagian
        int divide(int a, int b) {
            return a / b;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of KalkulatorSederhana to access the inner class
        pertemuan13 kalkulator = new pertemuan13();

        
        Calculator calc = kalkulator.new Calculator();

        // Inisialisasi nilai
        int a = 20;
        int b = 10;

        // nampilin hasilnya brok
       
        System.out.println("Hasil Pertambahan : " + calc.add(a, b));
        System.out.println("Hasil Pengurangan : " + calc.subtract(a, b));
        System.out.println("Hasil Perkalian : " + calc.multiply(a, b));
        System.out.println("Hasil Pembagian : " + calc.divide(a, b));
    }
}
