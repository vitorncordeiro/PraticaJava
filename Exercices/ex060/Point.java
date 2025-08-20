package dev.lpa;

public class Point implements  Mappable{
    private String name;
    private String location;

    public Point(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String render(){
        return "Render " + this + "as " + this.getClass().getSimpleName() + " ([" + location + "])";
    }
    @Override
    public String toString(){
        return name;
    }
}
