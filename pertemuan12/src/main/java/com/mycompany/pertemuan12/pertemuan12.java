package com.mycompany.pertemuan12;

/**
 *
 * @author user
 */
public class pertemuan12 {

    // Parent class
    class Employee {
        String name; 
        String position;
        int grade;
        double salary;
        double mealAllowance;
        double transportAllowance;

        // Constructor
        Employee(String name, String position, int grade, double salary, double mealAllowance, double transportAllowance) {
            this.name = name;
            this.position = position;
            this.grade = grade;
            this.salary = salary;
            this.mealAllowance = mealAllowance;
            this.transportAllowance = transportAllowance;
        }
    }

    // Child class
    class SystemAnalyst extends Employee {
        double bonus;

        // Constructor
        SystemAnalyst(String name, int grade, double salary, double mealAllowance, double transportAllowance, double bonus) {
            super(name, "System Analyst", grade, salary, mealAllowance, transportAllowance);
            this.bonus = bonus;
        }

        // Method to calculate total salary
        double calculateTotalSalary() {
            return salary + bonus + mealAllowance + transportAllowance;
        }

        // Method to display employee information and total salary
        void displaySalaryDetails() {
            System.out.println("Gaji " + position + " : " + salary);
            System.out.println("Bonus : " + bonus);
            System.out.println("Tunjangan Makan : " + mealAllowance);
            System.out.println("Transport : " + transportAllowance);
            System.out.println("Gaji Total : " + calculateTotalSalary());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of Tugasno23 to access the inner classes
        pertemuan12 tugas = new pertemuan12();

        // Create a SystemAnalyst object
        SystemAnalyst sa = tugas.new SystemAnalyst("John Doe", 1, 4000000, 400000, 500000, 1000000);

        // Display salary details
        sa.displaySalaryDetails();
    }
}
