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

public class KalkulatorKali {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        float hasil = calc.perkalian(10, 3);
        System.out.println("Hasil Perkalian: " + hasil);
    }
}
