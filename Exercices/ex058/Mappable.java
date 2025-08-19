package dev.lpa;

import java.util.List;

public interface Mappable {
    String JSON_PROPERTY = """
            "proprierties": {%s}""";

    String getLabel();
    String getType();
    String getIconType();

    default String toJSON(){
        return """
                "label": "%s", type": "%s", "marker": "%s" """
                .formatted(getLabel(), getType(), getIconType());
    }
    static void printProperties(Mappable mapInstance){
        System.out.println(JSON_PROPERTY.formatted(mapInstance.toJSON()));
    }
    static void printProperties(List<Mappable> mappableList){
        for(var mappable : mappableList){
            System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
        }
    }
}
