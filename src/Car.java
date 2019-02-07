public class Car extends Vehicle {
    private static final double AIR_CONDITION_FACTOR = 0.8;
    private boolean isAirCondition;

    public Car(String name, double tankCapacity, double averageBurning, boolean isAirConditionOff) {
        super(name, tankCapacity, averageBurning);
        this.isAirCondition = isAirConditionOff;
    }

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public void setAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    @Override
    void basicInfo() {
        super.basicInfo();
        System.out.println("Is air conditioning turned on: " + isAirCondition());
    }

    @Override
    double getDistanceRange() {
        double averageFuelConsumption = calculateFuelConsumption();
        double range = (this.getTankCapacity() / averageFuelConsumption)*100;
        return range;
    }

    @Override
    double calculateFuelConsumption() {
        double truckFuelConsumption = this.getAverageBurningOn100Km();
        if (this.isAirCondition()) {
            truckFuelConsumption += AIR_CONDITION_FACTOR;
        }
        return truckFuelConsumption;
    }
}
