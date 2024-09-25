/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan5part2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class pertemuan5part2 {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            //buat minta dimaukan nilai nilai
            System.out.print("Masukkan nilai alas: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan nilai tinggi: ");
            double tinggi = scanner.nextDouble();
            double luas = (alas * tinggi) / 2;
            //buat manggil hasil
            System.out.println("Luas Segitiga: " + luas);
        }
    }
}
