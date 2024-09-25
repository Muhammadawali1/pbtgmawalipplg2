/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7part2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class pertemuan7part2 {

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA : ");
        String nama = scanner.nextLine();
        
        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        
        // Membersihkan newline character yang tersisa setelah nextInt
        scanner.nextLine();

        System.out.print("PILIH PEMINATAN (M untuk Mobile, W untuk Web, D untuk Data): ");
        char peminatan = scanner.nextLine().charAt(0);

        // Nested switch untuk pemilihan peminatan berdasarkan tahun
        switch (tahun) {
            case 3:
                switch (peminatan) {
                    case 'M':
                        System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                        break;
                    case 'W':
                        System.out.println("PEMROGRAMAN WEB, DESAIN INTERFACE");
                        break;
                    case 'D':
                        System.out.println("DATA SCIENCE, MACHINE LEARNING");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                        break;
                }
                break;
            // Anda dapat menambahkan case untuk tahun lain jika diperlukan
            default:
                System.out.println("Tahun tidak valid atau belum didukung");
                break;
        }
    }
 }
