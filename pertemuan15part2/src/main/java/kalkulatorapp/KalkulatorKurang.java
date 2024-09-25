/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorapp;

/**
 *
 * @author user
 */
import kalkulatorpack.Kalkulator;

public class KalkulatorKurang {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        int hasil = calc.pengurangan(10, 5);
        System.out.println("Hasil Pengurangan: " + hasil);
    }
}