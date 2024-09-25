/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6part2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class pertemuan6part2 {

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
        String keterangan;
        
        if (nilai >= 80) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 70) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 60) {
            grade = "C";
            keterangan = "Lulus";
        } else if (nilai >= 50) {
            grade = "D";
            keterangan = "Tidak Lulus";
        } else {
            grade = "E";
            keterangan = "Tidak Lulus";
        }

        // Menampilkan hasil
      
        System.out.println("grade " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
