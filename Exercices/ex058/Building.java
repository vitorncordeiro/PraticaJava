package dev.lpa;

public class Building implements  Mappable{
    private String label;
    private String iconType;


    public Building(String label, String iconType){
        this.label = label;
        this.iconType = iconType;
    }
    @Override
    public String getLabel(){
        return label;
    }
    @Override
    public String getType(){
        return "Pointer";
    }
    @Override
    public String getIconType(){
        return iconType;
    }
}
