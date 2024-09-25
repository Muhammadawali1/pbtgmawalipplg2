package com.mycompany.pertemuan14part2;

// Deklarasi abstract class
abstract class abstrakhewan {

    // Method abstract
    public abstract void suara();

}

// Subclass Burung
class Burung extends abstrakhewan {

    @Override
    public void suara() {
       System.out.println("Suara Burung mencicit"); 

    }
}

// Main class
public class pertemuan14part2 {

    public static void main(String[] args) {
        // Membuat objek dari subclass Burung
        abstrakhewan burung = new Burung();

        // Memanggil method abstract
        burung.suara();

    }
}
