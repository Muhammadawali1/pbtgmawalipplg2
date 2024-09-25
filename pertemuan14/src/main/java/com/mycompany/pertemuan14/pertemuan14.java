/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14;

/**
 *
 * @author user
 */
abstract class abstrakhewan {
    // Method abstract
    public abstract void suara();
    
    // Method non-abstract
    public void suara2(){
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Subclass Anjing
class Anjing extends abstrakhewan {
    // Mengimplementasikan method abstract
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong: Woof! Woof!");
    }
}

// Subclass Kucing
class Kucing extends abstrakhewan {
    // Mengimplementasikan method abstract
    @Override
    public void suara() {
        System.out.println("Kucing mengeong: Meow! Meow!");
    }
}

// Main class
public class pertemuan14 {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        abstrakhewan anjing = new Anjing();
        abstrakhewan kucing = new Kucing();
        
        // Memanggil method abstract
        anjing.suara();
        kucing.suara();
        
        // Memanggil method non-abstract
        
        kucing.suara2();
    }
}