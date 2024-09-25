/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class pertemuan6 {

    public static void main(String[] args) {
         
       Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        // Menentukan grade berdasarkan nilai
        String grade;
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Menampilkan hasil
        System.out.println("Output :");
        System.out.println("grade " + grade);

    }
}
