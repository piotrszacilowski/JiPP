package task123.model;

public abstract class Vehicle {
    public String name;
    public int fuel;

    public Vehicle(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public abstract void refuel(Object fuel);

    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }
}
