package com.aerospace.analyzer;

public class PerformanceCalculator {
    public static double calculateThrustToWeightRatio(double thrustInNewtons, double weightInKg) {
        double gravity = 9.81;
        double weightInNewtons = weightInKg * gravity;
        if (weightInNewtons == 0) {
            return 0.0;
        }
        return thrustInNewtons / weightInNewtons;
    }

    public static double estimateClimbRate(double excessPowerInWatts, double weightInKg) {
        double gravity = 9.81;
        if (weightInKg == 0) {
            return 0.0;
        }
        return excessPowerInWatts / (weightInKg * gravity);
    }
}