/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan10part2;

class Aritmatika3 {

    public int penjumlahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

/**
 *
 * @author user
 */
public class pertemuan10part2 {

    public static void main(String[] args) {
        Aritmatika3 aritmatika = new Aritmatika3();

        int bilangan1 = 7;
        int bilangan2 = 3;

        // Mengakses metode pada Aritmatika3
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        int hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);

        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}
