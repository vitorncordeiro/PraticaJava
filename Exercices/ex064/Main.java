package dev.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
    var sum = calculator((a, b)-> a + b, 2, 3);

//        Random ran = new Random();
//        Supplier<Double> a = () -> ran.nextDouble(0, 10);
//        for (int i = 0; i < 10; i++){
//            System.out.println(a.get());
//        }


        Consumer<String> printTheParts = (s) -> {
            String[] arr = s.split(" ");
            for (var i : arr) {
                System.out.println(i);
            }

        };
        printTheParts.accept("Lets split it up in to an array");

        Consumer<String> printForEach = (s) -> {
            List<String> arr = new ArrayList<>(List.of(s.split(" ")));
            arr.forEach(t-> System.out.println(t));
        };
        printForEach.accept("Hello, my name is Oswaldo Cruz");
    }


    public static <T, U, R> R calculator(BiFunction<T, U, R> function, T o1, U o2){
        R result = function.apply(o1, o2);
        System.out.println(result);
        return result;
    }
}

