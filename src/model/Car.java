package model;

public class Car extends Vehicle {
    public Car(String name, int fuel) {
        super(name, fuel);
    }

    @Override
    public void refuel(Object fuel) {
        System.out.println(getName() + " is refuelled with " + fuel);
    }
}
