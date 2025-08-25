package dev.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("bob");
        lista.add("oto");
        lista.add("ana");
        UnaryOperator<List<String>> upper2 = as -> {

            as.forEach(t -> as.set(as.indexOf(t), replaceRandomly(t.toUpperCase())) );
            return as;
        };
        System.out.println(upper2.apply(lista));
    }
    public static String replaceRandomly(String target){
        Random random = new Random();
        int i = random.nextInt(0, target.length());
        String partOne = target.substring(0, i);
        String partTwo = target.substring(i, target.length());
        return partOne + target.charAt(0) + "." + partTwo;
    }
}

