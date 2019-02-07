public class VehicleTest {

    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 150, 6, false);
        cars[1] = new Car("Skoda", 100, 12.5, false);
        cars[2] = new Truck("Renault", 300, 10, false, 500.50);
        cars[3] = new Truck("Volvo", 100, 12.5, false, 450.1);

        System.out.println("========================");
        System.out.println("Before air conditioning:");
        for (int i = 0; i < cars.length; i++) {
            cars[i].basicInfo();
            cars[i].printDistanceRange();
        }
        System.out.println("========================");
        System.out.println("Turn air conditioning ON:");
        for (Car car : cars) {
            car.setAirCondition(true);
        }

        System.out.println("========================");
        System.out.println("After air conditioning:");
        int i = 0;
        while (i < cars.length) {
            cars[i].basicInfo();
            cars[i].printDistanceRange();
            i++;
        }
    }
}