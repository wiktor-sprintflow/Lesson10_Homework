package task01;

public class VehiclesApp {
    public static void main(String[] args) {

        Car[] cars = new Car[4];

        cars[0] = new Car("BMW 3", 60, 7, false);
        cars[1] = new Car("Subaru Impreza", 55, 10, false);
        cars[2] = new Truck("MAN", 350, 20, false, 1000);
        cars[3] = new Truck("VOLVO", 400, 20, false, 2000);

        showCars(cars);
        turnOnAirCondition(cars);
        System.out.println();
        showCars(cars);
    }

    private static void showCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void turnOnAirCondition(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].setAirCondition(true);
        }
    }
}