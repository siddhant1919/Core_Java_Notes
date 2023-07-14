package com.elecrticCar;

import car.Car;

public class ElectricCar extends Car {
	
	private int batteryCapacity;
    
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
