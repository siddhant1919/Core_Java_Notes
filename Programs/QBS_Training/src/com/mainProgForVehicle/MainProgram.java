package com.mainProgForVehicle;

import com.vehicle.Vehicle;
import car.Car;
import com.elecrticCar.ElectricCar;

public class MainProgram {
	

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
        vehicle.setManufacturer("Ford");
        vehicle.setYear(2022);
        
        Car car = new Car();
        car.setManufacturer("Honda");
        car.setYear(2021);
        car.setModel("Civic");
        
        ElectricCar electricCar = new ElectricCar();
        electricCar.setManufacturer("Tesla");
        electricCar.setYear(2022);
        electricCar.setModel("Model S");
        electricCar.setBatteryCapacity(100);
        
        System.out.println(vehicle.getManufacturer() + " " + vehicle.getYear());
        System.out.println(car.getManufacturer() + " " + car.getYear() + " " + car.getModel());
        System.out.println(electricCar.getManufacturer() + " " + electricCar.getYear() + " " + electricCar.getModel() + " " + electricCar.getBatteryCapacity() + " kWh");
        
	}

}
