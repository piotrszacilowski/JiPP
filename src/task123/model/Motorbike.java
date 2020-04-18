package task123.model;

public class Motorbike extends Vehicle {

    public Motorbike(String name, int fuel) {
        super(name, fuel);
    }

    @Override
    public void refuel(Object fuel) {
        System.out.println(getName() + " is refuelled " + fuel);
    }
}
