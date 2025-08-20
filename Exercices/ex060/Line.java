package dev.lpa;

import java.util.ArrayList;

public class Line implements  Mappable{
    private String name;
    private ArrayList<String> locations;

    public Line(String name, String start, String mid, String end ){
        this.name = name;
        this.locations = new ArrayList<>();
        locations.add(start);
        locations.add(mid);
        locations.add(end);
    }

    public String getName() {
        return name;
    }
    public ArrayList<String> getLocations(){
        return locations;
    }

    @Override
    public String render(){
        String formatedRender = ("Render  %s as %s " + "([[%s], [%s], [%s]])" +
                "").formatted(this, this.getClass().getSimpleName(), locations.get(0), locations.get(1),
                locations.get(2));
        return formatedRender;
    }
    @Override
    public String toString(){
        return name;
    }
}
