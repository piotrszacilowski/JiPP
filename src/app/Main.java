package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        Car bmw_m5 = new Car("BMW M5", 60);
        Car fiat_panda = new Car("Fiat Panda", 30);
        Motorbike yamaha_yzf_r125 = new Motorbike("Yamaha yzf r125", 15);
        Plane airbus_a380 = new Plane("Airbus A380", 2000);
        Plane boeing_787 = new Plane("Boeing 787-8", 2000);
        Plane cessna = new Plane("Cessna", 2000);
        Boat azimut_yacht = new Boat("Azimut Yacht", 3000);

        gasStation("98 Gasoline", bmw_m5);
        gasStation("95 Gasoline", yamaha_yzf_r125, fiat_panda);
        gasStation("Aviation fuel", airbus_a380, boeing_787, cessna);



        VehicleCollection vehicleCollection = new VehicleCollection();
        vehicleCollection.createVehicleCollection(bmw_m5, fiat_panda, airbus_a380, cessna, yamaha_yzf_r125,azimut_yacht);

        System.out.println("\nYour vehicle collection: ");
        vehicleCollection.printVehicleCollection();
    }

    private static void gasStation(String type, Vehicle... vehicles) {
        for (var vehicle : vehicles) {
            vehicle.refuel(type);
        }
    }
}