public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Starting Engine Mitsubishi";
    }
    @Override
    public String accelerate(){
        return "Accelerating Mitsubishi";
    }
    @Override
    public String brake(){
        return "Braking Car Mitsubishi";
    }
    
}
