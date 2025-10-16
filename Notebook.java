public final class Notebook extends Laptop{
    public int calculatePortablilityScore(){
        return 1;
    }
    public Notebook( String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight){
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }

    public String getComputerType(){
        return "Computadora-laptop: NOTEBOOK";
    }
}
