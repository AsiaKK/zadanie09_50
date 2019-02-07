public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageBurningOn100Km;

    public Vehicle(String name, double tankCapacity, double averageBurning) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageBurningOn100Km = averageBurning;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAverageBurningOn100Km() {
        return averageBurningOn100Km;
    }

    void basicInfo() {
        System.out.println("---------------");
        System.out.println("Basic information about Vehicle: ");
        System.out.println("Name: " + name);
        System.out.println("Tank Capacity: " + tankCapacity);
        System.out.println("Average Burning on 100km: " + calculateFuelConsumption());
    }

    void printDistanceRange() {
        System.out.println("Distance range: " + getDistanceRange() + "km");
    }

    double getDistanceRange() {
        return tankCapacity / averageBurningOn100Km;
    }

    double calculateFuelConsumption() {
        double truckFuelConsumption = this.getAverageBurningOn100Km();
        return truckFuelConsumption;
    }
}