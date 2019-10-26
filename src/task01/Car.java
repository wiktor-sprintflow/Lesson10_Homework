package task01;

public class Car extends Vehicle{
    private boolean isAirConditionOn;
    private double airConditionFuelConsumption = 0.8;

    Car(String name, double tankCapacity, double avgFuelConsumption, boolean isAirConditionOn) {
        super(name, tankCapacity, avgFuelConsumption);
        this.isAirConditionOn = isAirConditionOn;
    }

    public boolean isAirConditionOn() {
        return isAirConditionOn;
    }

    public void setAirCondition(boolean isAirConditionOn) {
        this.isAirConditionOn = isAirConditionOn;
    }

    @Override
    protected double calculateRange(double tankCapacity, double avgFuelConsumption) {
        double range = isAirConditionOn ? tankCapacity / (avgFuelConsumption + airConditionFuelConsumption) * 100 : super.calculateRange(tankCapacity,avgFuelConsumption);
        return range;
    }

    @Override
    public String toString() {
        return super.toString() + ", klimatyzacja właczona: " + isAirConditionOn;
    }
}