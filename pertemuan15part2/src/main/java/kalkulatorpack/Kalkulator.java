/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorpack;

public class Kalkulator {

    // Method untuk penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan (a - b)
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk pembagian (a / b)
    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagi tidak boleh 0!");
            return 0;
        }
    }

    // Method untuk perkalian (a * b)
    public float perkalian(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        
        int hasilPenjumlahan = kalkulator.penjumlahan(5, 3);
        int hasilPengurangan = kalkulator.pengurangan(5, 3);
        float hasilPembagian = kalkulator.pembagian(10.0f, 2.0f);
        float hasilPerkalian = kalkulator.perkalian(4.5f, 2.0f);

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}

