package services;

import Model.*;
import exceptions.CabNotAvailableException;

import java.util.*;

public class RideService {

    private Map<String, User> users = new HashMap<>();
    private Map<String, Driver> drivers = new HashMap<>();

    // User onboarding
    public void addUser(String name, String gender, int age) {
        users.put(name, new User(name, gender, age));
    }

    // Driver onboarding
    public void addDriver(String name, String vehicleModel,
                          String vehicleNumber, Location location) {
        Vechicle vehicle = new Vechicle(vehicleModel, vehicleNumber);
        Driver driver = new Driver(name, vehicle, location);
        drivers.put(name, driver);
    }

    // Find ride
    public List<String> findRide(String username, Location source, Location destination) {
        List<String> availableDrivers = new ArrayList<>();

        for (Driver driver : drivers.values()) {
            if (driver.isAvailable() &&
                    driver.getLocation().Distance(source) <= 5) {
                availableDrivers.add(driver.getName());
            }
        }

        if (availableDrivers.isEmpty()) {
            System.out.println("No ride found");
        } else {
            System.out.println("Available Drivers: " + availableDrivers);
        }
        return availableDrivers;
    }

    // Choose ride
    public void chooseRide(String username, String driverName) {
        Driver driver = drivers.get(driverName);

        if (driver == null || !driver.isAvailable()) {
            throw new CabNotAvailableException("Driver not available");
        }

        driver.setAvailable(false);
        System.out.println(username + " booked " + driverName);
    }
}
