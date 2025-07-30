public class Ford extends Car{
     public Ford(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Starting Engine Ford";
    }
    @Override
    public String accelerate(){
        return "Accelerating Ford";
    }
    @Override
    public String brake(){
        return "Braking Car Ford";
    }
}
