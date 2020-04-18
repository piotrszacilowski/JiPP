package task123.app;

import task123.model.Vehicle;

public class VehicleCollection {
    private static final int MAX_VEHICLES = 10;
    private  int vehiclesNumber = 0;
    private Vehicle[] vehiclesCollection = new Vehicle[MAX_VEHICLES];

    public void createVehicleCollection (Vehicle... vehicles){
        for (int i = 0; i < vehicles.length; i++) {
            if (vehiclesNumber < MAX_VEHICLES) {
                this.vehiclesCollection[vehiclesNumber] = vehicles[vehiclesNumber];
                vehiclesNumber++;
            } else {
                System.err.println("the maximum number of vehicles has been exceeded " + MAX_VEHICLES);
            }
        }
    }

    public void printVehicleCollection() {
        for (Vehicle vehicle : vehiclesCollection) {
            if (vehicle instanceof Vehicle) {
                System.out.println(vehicle.getName());
            }
        }
    }
}
