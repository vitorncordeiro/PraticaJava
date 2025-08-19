package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mappable jardimBotanico = new Building("Jardim Botânico", "Green Push pin");
        Mappable.printProperties(jardimBotanico);

        Mappable jardimBotanicoPipes = new UtilityLine("Jardim Botânico Pipes", "Red Line", "Plumbing");
        Mappable.printProperties(jardimBotanicoPipes);

        System.out.println("--------------------------------------------");

        List<Mappable> places = new ArrayList<>();
        places.add(jardimBotanico);
        places.add(jardimBotanicoPipes);
        Mappable.printProperties(places);
        
    }
}


