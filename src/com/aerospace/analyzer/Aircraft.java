package com.aerospace.analyzer;

public abstract class Aircraft {
    private String modelName;
    private double emptyWeight;
    private double maxFuelCapacity;

    public Aircraft(String modelName, double emptyWeight, double maxFuelCapacity) {
        this.modelName = modelName;
        this.emptyWeight = emptyWeight;
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public abstract double calculateMaxRange();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public void setMaxFuelCapacity(double maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    @Override
    public String toString() {
        return "Model: " + modelName + " | Empty Weight: " + emptyWeight + " kg | Max Fuel: " + maxFuelCapacity + " kg";
    }
}