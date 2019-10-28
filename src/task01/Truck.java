package task01;

public class Truck extends Car {
    private double loadWeight;
    private static final double FUEL_CONSUMPTION_LOAD_FACTOR = 0.5;

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
    protected double getTotalFuelConsumption() {
        return isAirConditionOn() ? (withoutAirConditionFuelConsumption() + AIR_CONDITION_FUEL_CONSUMPTION) : (withoutAirConditionFuelConsumption());
    }

    private double withoutAirConditionFuelConsumption() {
        return getAvgFuelConsumption() + getLoadFactor();
    }

    private double getLoadFactor() {
        return FUEL_CONSUMPTION_LOAD_FACTOR * loadWeight / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", masa ładunku: " + loadWeight + " kg";
    }
}