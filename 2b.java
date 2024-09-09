// Vehicle interface
interface Vehicle {
    void startRide();
}

// Concrete Vehicle classes
class Car implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Starting a ride in a car.");
    }
}

class Bike implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Starting a ride on a bike.");
    }
}

class Scooter implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Starting a ride on a scooter.");
    }
}

// Factory Method for creating vehicles
abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public static VehicleFactory getFactory(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new CarFactory();
            case "bike":
                return new BikeFactory();
            case "scooter":
                return new ScooterFactory();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

class ScooterFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}
