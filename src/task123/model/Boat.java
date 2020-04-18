package task123.model;

public class Boat extends Vehicle {
    public Boat(String name, int fuel) {
        super(name, fuel);
    }

    @Override
    public void refuel(Object fuel) {
        System.out.println(getName() + " is refuelled " + fuel);
    }
}
