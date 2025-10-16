
public class Desktop extends Computer {
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    @Override
    public String getComputerType() {
        return "Computadora de escritorio";
    }

    public int calculatePortablilityScore() {
        int aux = (int) (5 + (caseHeight/20));
        return aux;
    }

    public String toString(){
        return getModel() + "\t" + getManufacturer() + "\t" + getOperatingSystem() + "\t" + getComputerType();
    }
}
