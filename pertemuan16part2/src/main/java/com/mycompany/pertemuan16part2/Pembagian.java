/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16part2;

/**
 *
 * @author user
 */
public class Pembagian extends OperasiAritmatika {

    // Implementasi method hitung untuk pembagian
    @Override
    protected double hitung() {
        if (B != 0) {
            return A / B;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}
