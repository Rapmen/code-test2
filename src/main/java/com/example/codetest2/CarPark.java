package com.example.codetest2;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class CarPark extends Locale {

    @Getter
    @Setter
    private List<Vehicle> vehicles;

    public CarPark(int length, int width, List<Vehicle> vehicles) {
        super(length, width);
        this.vehicles = vehicles;
        setName("Car Park");
    }

    @Override
    public String toString() {
        return "CarPark{" + "siz=" + getLength() + " * " + getWidth() + ", vehicles=" + vehicles + '}';
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles == null) {
            vehicles = new ArrayList<>();
        }

        vehicles.add(vehicle);
    }

    @Override
    public void checkPosition(int x, int y) throws Exception {
        if (x > getWidth() || x < 1 || y > getLength() || y < 1) {
            throw new Exception("The car drove out of the border");
        }
    }
}
