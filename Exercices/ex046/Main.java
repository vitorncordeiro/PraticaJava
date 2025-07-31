public class Main {
    public static void main(String[] args) {
        Car classeCarro = new GasPoweredCar("RAM", 6);
        Car byd = new ElectricCar("BYD", 40);
        System.out.println(classeCarro.startEngine());
        System.out.println(byd.startEngine());
    }
}
