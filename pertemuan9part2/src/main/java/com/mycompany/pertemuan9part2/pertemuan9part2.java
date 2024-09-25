/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan9part2;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class pertemuan9part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai awal dan nilai akhir
        System.out.print("Masukan bilangan awal : ");
        int nilaiAwal = input.nextInt();
        System.out.print("Masukan bilangan akhir : ");
        int nilaiAkhir = input.nextInt();

        System.out.println("Hasil deret bilangan :");

        // Loop untuk menampilkan deret bilangan dengan pertambahan 5
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            if (i + 5 <= nilaiAkhir) {
                System.out.print(i + " , ");
            } else {
                System.out.print(i); // tidak mencetak koma setelah bilangan terakhir
            }
        }
    }
}
