/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan10;

class Aritmatika2 {

    // Method penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }
}

// Kelas Aritmatika3 (Subclass yang memperluas Aritmatika2)
class Aritmatika3 extends Aritmatika2 {

    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Method pangkat
    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
/**
 *
 * @author user
 */
public class pertemuan10 {

    public static void main(String[] args) {
        // Membuat objek dari kelas Aritmatika3
        Aritmatika3 aritmatika = new Aritmatika3();

        // Contoh penggunaan metode
        System.out.println("Penjumlahan: " + aritmatika.penjumlahan(5, 3));
        System.out.println("Pengurangan: " + aritmatika.pengurangan(5, 3));
        System.out.println("Perkalian: " + aritmatika.perkalian(5, 3));
        System.out.println("Pembagian: " + aritmatika.pembagian(5, 3));
        System.out.println("Pangkat: " + aritmatika.pangkat(5, 3));
    }
}
