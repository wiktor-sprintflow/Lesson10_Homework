package task01;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double avgFuelConsumption;

    Vehicle(String name, double tankCapacity, double avgFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption = avgFuelConsumption;
    }

    protected double calculateRange(double tankCapacity, double avgFuelConsumption) {
        return tankCapacity / avgFuelConsumption * 100;
    }

    @Override
    public String toString() {
        return "Zasięg pojazdu: " + calculateRange(tankCapacity, avgFuelConsumption) + " km" +
                ", nazwa: '" + name + '\'' +
                ", pojemność baku: " + tankCapacity + " litrów" +
                ", podstawowe średnie spalanie: " + avgFuelConsumption + " l/km";
    }
}