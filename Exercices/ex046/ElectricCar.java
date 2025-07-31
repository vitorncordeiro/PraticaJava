public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, int batterySize) {
        super(name);
        this.batterySize = batterySize;
    }

}

