public class Laptop extends Computer implements PortableDevice {
    private int batteryCapacity;
    private double weight;

    public Laptop( String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight ){
        super(model,manufacturer,operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public String getComputerType(){
        return "computadora portátil";
    }

    public int calculatePortablilityScore() {
        return (int) (weight);
    }

    public String getModel(){
        return getManufacturer();
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public String toString(){
        return getModel() + "\t" + getManufacturer() + "\t" + getOperatingSystem() + "\t" + getComputerType();
    }
}
