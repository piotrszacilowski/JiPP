package model;

public class Plane extends Vehicle {
    public Plane(String name, int fuel) {
        super(name, fuel);
    }

    @Override
    public void refuel(Object fuel) {
        System.out.println(getName() + " is refuelled " + fuel);
    }
}
