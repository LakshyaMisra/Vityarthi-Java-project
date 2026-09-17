# Vityarthi-Java-project

# Aircraft Performance & Flight Path Analyzer

A Java-based command-line application developed for the VITyarthi online course[cite: 1]. This project manages aircraft fleets, computes performance metrics (such as thrust-to-weight ratios and climb rates), validates user input defensively, and exports structured reports.

## Project Structure
The project is organized under the `com.aerospace.analyzer` package:
* `Aircraft.java` - Abstract base class defining common aircraft attributes.
* `CommercialAircraft.java` - Concrete subclass implementing specific commercial calculations.
* `FlightManager.java` - Manages fleet data using Java Collections (`ArrayList`).
* `PerformanceCalculator.java` - Contains static utilities for aerospace performance equations.
* `FileManager.java` - Handles file I/O for saving fleet reports.
* `InputValidator.java` - Defensive utility for handling safe console inputs.
* `Main.java` - CLI menu interface and execution controller.

## Prerequisites
* Java Development Kit (JDK) 17 or higher.

## How to Compile and Run

1. Open your terminal and navigate to the `src` directory:
   ```bash
   cd src

2. Compile all Java source files:
   ```bash
   javac com/aerospace/analyzer/*.java

3. Run the application:
   ```bash
   java com.aerospace.analyzer.Main

## Features

 * Add, view, and remove commercial aircraft from a managed fleet.
 * Calculate mechanical parameters like thrust-to-weight ratios.
 * Input error handling to prevent runtime crashes.
 * Save generated reports directly to a text file.
