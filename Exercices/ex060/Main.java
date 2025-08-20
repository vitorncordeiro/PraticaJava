package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mappable anhangava = new Mountain("Morro Do Anhagava", "-25.38726621202262, -49.004041853020816", 1430);
        Mappable paoDeLoth = new Mountain("Morro Pão de Ló", "-55.38726621202262, -35.004041853020816", 1300);
        Mappable rioParana = new River("Rio Paraná", "-20.11522105148362, -51.01469240947763", "-22.37641023906517, -52.87429467444514",
                "-34.29967520146911, -58.545453310445275", 4880, 170);

        List<Mappable> myList = new ArrayList<>();
        myList.add(anhangava);
        myList.add(paoDeLoth);
        myList.add(rioParana);

        Layer layer = new Layer(myList);
        layer.renderLayer();

    }
}


