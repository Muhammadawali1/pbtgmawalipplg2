/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18;

/**
 *
 * @author user
 */
public class trycatch {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
//penjelaan
//Blok ini digunakan untuk menangkap dan menangani exception yang mungkin terjadi selama eksekusi program.
//intinya:Menangkap dan menangani exception yang terjadi.