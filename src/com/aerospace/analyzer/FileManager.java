package com.aerospace.analyzer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {
    public static void saveFleetReport(String filename, String reportContent) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(reportContent);
            System.out.println("Fleet report successfully saved to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file: " + e.getMessage());
        }
    }
}