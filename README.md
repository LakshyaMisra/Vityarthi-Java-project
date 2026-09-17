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

## Example Test Data 
If you want to test the program quickly, you can use these real-world aircraft values:

* **Boeing 737-800**
  * *For Fleet Entry (Options 1 & 2):* Empty Weight: `41413` kg | Max Fuel: `20810` kg | Passengers: `162`
  * *For Thrust-to-Weight Ratio (Option 4):* Total Thrust: `242000` N | Aircraft Weight: `70000` kg

* **Airbus A320neo**
  * *For Fleet Entry (Options 1 & 2):* Empty Weight: `44300` kg | Max Fuel: `19050` kg | Passengers: `165`
  * *For Thrust-to-Weight Ratio (Option 4):* Total Thrust: `240000` N | Aircraft Weight: `68000` kg
