/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17part2;

/**
 *
 * @author user
 */
public class Pertemuan17part2 {

    public static void main(String[] args) {
        // Membuat array multidimensi untuk nama negara dan ibukotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses array dan menampilkan hasilnya
        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    }
} 