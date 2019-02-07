public class Truck extends Car {
    public static final double AIR_CONDITION_FACTOR = 1.6;
    public static final double LOAD_FACTOR = 0.5;
    private double loadSize;

    public Truck(String name, double tankCapacity, double averageBurning, boolean isAirConditionOff, double loadSize) {
        super(name, tankCapacity, averageBurning, isAirConditionOff);
        this.loadSize = loadSize;
    }

    public double getLoadSize() {
        return loadSize;
    }

    public void setLoadSize(double loadSize) {
        this.loadSize = loadSize;
    }

    @Override
    double getDistanceRange() {
        double averageFuelConsumption = calculateFuelConsumption();
        double range = this.getTankCapacity() / averageFuelConsumption;
        return range;
    }

    @Override
    double calculateFuelConsumption() {
        double truckFuelConsumption = this.getAverageBurningOn100Km();
        if (this.isAirCondition()) {
            truckFuelConsumption += AIR_CONDITION_FACTOR;
        }
        truckFuelConsumption += (loadSize / 100) * LOAD_FACTOR;
        return truckFuelConsumption;
    }

    @Override
    void basicInfo() {
        super.basicInfo();
        System.out.println("Load size of Truck: " + loadSize + "kg");
    }
}