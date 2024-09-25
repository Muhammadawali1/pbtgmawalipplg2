/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9;

/**
 *
 * @author user
 */
public class pertemuan9 {

    public static void main(String[] args) {
     int i = 1;

        // Perulangan luar menggunakan while
        while (i <= 5) {
            int j = 1;

            // Perulangan dalam menggunakan while
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println(); // baris baru
            i++;
        }

  
    }
}
