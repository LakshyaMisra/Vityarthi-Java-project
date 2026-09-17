package com.aerospace.analyzer;

public class CommercialAircraft extends Aircraft {
    private int passengerCapacity;

    public CommercialAircraft(String modelName, double emptyWeight, double maxFuelCapacity, int passengerCapacity) {
        super(modelName, emptyWeight, maxFuelCapacity);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateMaxRange() {
        double totalWeight = getEmptyWeight() + (passengerCapacity * 90) + getMaxFuelCapacity();
        return (getMaxFuelCapacity() / totalWeight) * 8500.0;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Passengers: " + passengerCapacity + " | Est. Max Range: " + calculateMaxRange() + " km";
    }
}