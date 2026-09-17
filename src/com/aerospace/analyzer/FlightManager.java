package com.aerospace.analyzer;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {
    private List<Aircraft> aircraftList;

    public FlightManager() {
        this.aircraftList = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
        System.out.println("Successfully added: " + aircraft.getModelName());
    }

    public void listAllAircraft() {
        if (aircraftList.isEmpty()) {
            System.out.println("No aircraft registered in the system yet.");
            return;
        }
        System.out.println("\n--- Current Aircraft Fleet ---");
        for (int i = 0; i < aircraftList.size(); i++) {
            System.out.println((i + 1) + ". " + aircraftList.get(i));
        }
    }

    public void removeAircraft(int index) {
        if (index >= 0 && index < aircraftList.size()) {
            Aircraft removed = aircraftList.remove(index);
            System.out.println("Removed aircraft: " + removed.getModelName());
        } else {
            System.out.println("Invalid index selection.");
        }
    }

    public int getFleetSize() {
        return aircraftList.size();
    }
}