package com.aerospace.analyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager manager = new FlightManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Aircraft Performance & Flight Path Analyzer ===");
            System.out.println("1. Add Commercial Aircraft");
            System.out.println("2. View All Aircraft Fleet");
            System.out.println("3. Remove Aircraft");
            System.out.println("4. Calculate Thrust-to-Weight Ratio");
            System.out.println("5. Save Fleet Report to File");
            System.out.println("6. Exit");
            
            int choice = InputValidator.getPositiveInt(scanner, "Choose an option (1-6): ");

            switch (choice) {
                case 1:
                    System.out.print("Enter Model Name: ");
                    scanner.nextLine();
                    String model = scanner.nextLine();
                    double emptyWeight = InputValidator.getPositiveDouble(scanner, "Enter Empty Weight (kg): ");
                    double maxFuel = InputValidator.getPositiveDouble(scanner, "Enter Max Fuel Capacity (kg): ");
                    int passengers = InputValidator.getPositiveInt(scanner, "Enter Passenger Capacity: ");
                    
                    CommercialAircraft ac = new CommercialAircraft(model, emptyWeight, maxFuel, passengers);
                    manager.addAircraft(ac);
                    break;

                case 2:
                    manager.listAllAircraft();
                    break;

                case 3:
                    manager.listAllAircraft();
                    if (manager.getFleetSize() > 0) {
                        int indexToRemove = InputValidator.getPositiveInt(scanner, "Enter index number to remove: ") - 1;
                        manager.removeAircraft(indexToRemove);
                    }
                    break;

                case 4:
                    double thrust = InputValidator.getPositiveDouble(scanner, "Enter Total Thrust (N): ");
                    double weight = InputValidator.getPositiveDouble(scanner, "Enter Aircraft Weight (kg): ");
                    double ttw = PerformanceCalculator.calculateThrustToWeightRatio(thrust, weight);
                    System.out.println("Calculated Thrust-to-Weight Ratio: " + ttw);
                    break;

                case 5:
                    FileManager.saveFleetReport("fleet_report.txt", "Report generated successfully.");
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Select between 1 and 6.");
                    break;
            }
        }
        scanner.close();
    }
}