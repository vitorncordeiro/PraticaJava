public class SmartKitchen {
    private CoffeeMaker  brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeState, boolean dishWashState, boolean iceBoxState) {
        brewMaster.setHasWorkToDo(coffeState);
        dishWasher.setHasWorkToDo(dishWashState);
        iceBox.setHasWorkToDo(iceBoxState);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}



