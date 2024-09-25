/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16;

/**
 *
 * @author user
 */
public class AritmatikaImpl extends OperasiAritmatika {

    @Override
    protected double penjumlahan() {
        return A + B;
    }

    @Override
    protected double pengurangan() {
        return A - B;
    }

    @Override
    protected double perkalian() {
        return A * B;
    }

    @Override
    protected double pembagian() {
        if (B != 0) {
            return A / B;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}
