/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan8part2;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class pertemuan8part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tahun awal dan tahun akhir
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = input.nextInt();
        System.out.print("Tahun Awal ?: ");
        int tahunAwal = input.nextInt();

        System.out.println("Hasil nya :");

        // Loop untuk menampilkan tahun dari tahun akhir ke tahun awal
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }
    }
}
