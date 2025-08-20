package dev.lpa;

public class Mountain extends Point{
    private double height;
    private String type;

    public Mountain(String name, String location, double height){
        super(name, location);
        this.height = height;
        this.type = height > 300 ? "Mountain" : "Hill";
    }

    public double getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
    @Override
    public String render(){
        String superR = super.render();
        String thisFields = "\n[Height: %f], [Type: %s]".formatted(height, type);
        return superR + thisFields;
    }
}
