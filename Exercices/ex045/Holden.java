
public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Starting Engine Holden";
    }
    @Override
    public String accelerate(){
        return "Accelerating Holden";
    }
    @Override
    public String brake(){
        return "Braking Car Holden";
    }
}
