import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList <Computer> computers = new ArrayList<>();
    computers = { (new Desktop("2020", "IBM", "Windows", 4.7),
            new Desktop("2021", "IBM", "Ubuntu", 4.2),
            new Desktop("2020", "HP", "ARCH", 7.9),
            new Laptop("2020", "IBM", "Windows", 800, 4.0),
            new Laptop("2024", "LENOVO", "Windows", 5000, 4.0),
            new Laptop("2022", "SMART", "MacOS", 2000, 4.0),
            new Notebook("2020", "IBM", "Windows", 800, 4.0))
    }

    int contador = 1;
        System.out.println("No.\tModelo\tMarca\tSO\tTipo");
    for(Computer c : computers){
        System.out.println(contador + "\t" + c.toString());
    }
}
