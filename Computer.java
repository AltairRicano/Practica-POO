public abstract class Computer {
    private String model;
    private String manufacturer;
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculatePortablilityScore();
    public abstract String toString();
}
