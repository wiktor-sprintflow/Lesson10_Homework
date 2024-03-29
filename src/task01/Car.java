package task01;

public class Car extends Vehicle {
    private boolean isAirConditionOn;
    protected static final double AIR_CONDITION_FUEL_CONSUMPTION = 0.8;

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
    protected double calculateRange() {
        return getTankCapacity() / getTotalFuelConsumption() * 100;
    }

     protected double getTotalFuelConsumption() {
        return (isAirConditionOn ? getAvgFuelConsumption() + AIR_CONDITION_FUEL_CONSUMPTION : getAvgFuelConsumption()) ;
    }

    @Override
    public String toString() {
        return super.toString() + ", klimatyzacja właczona: " + isAirConditionOn;
    }
}