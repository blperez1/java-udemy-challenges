package polymorphism;

public class Car {
    private String name;
    private boolean hasEngine;
    private int cylinders;
    private int tires;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.tires = 4;
        this.hasEngine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getTires() {
        return tires;
    }

    public String startEngine() {
        return "Engine Started";
    }

    public String accelerate() {
        return "accelerate";
    }

    public String brake() {
        return "Brakes have been applied";
    }
}
