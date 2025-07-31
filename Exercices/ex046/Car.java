public abstract class Car {
   private String name;
   private boolean engine;

   public Car(String name){
       this.name = name;
   }
    public String startEngine(){
        return "Starting engine" + this.getClass().getSimpleName();
    }
   public String drive(){
        return "Driving";
   }
   protected void runEngine(boolean isEngineOn){
       this.engine = isEngineOn;
   }


}


