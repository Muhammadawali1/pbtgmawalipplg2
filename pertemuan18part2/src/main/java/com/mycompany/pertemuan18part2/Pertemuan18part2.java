/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan18part2;

/**
 *
 * @author user
 */
public class Pertemuan18part2 {

    public static void main(String[] args) {

        try {
            // Kode di bawah ini tidak melempar exception
            Float data = 500f / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Blok finally akan selalu dieksekusi");
        }
    }
}
