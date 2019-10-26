package task01;

public class Truck extends Car {
    private double loadWeight;

    Truck(String name, double tankCapacity, double avgFuelConsumption, boolean isAirConditionOn, double loadWeight) {
        super(name, tankCapacity, avgFuelConsumption, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    protected double calculateRange(double tankCapacity, double avgFuelConsumption) {
        avgFuelConsumption += 0.5 * loadWeight / 100;
        return super.calculateRange(tankCapacity, avgFuelConsumption);
    }

    @Override
    public String toString() {
        return super.toString() + ", masa ładunku: " + loadWeight + " kg";
    }

}