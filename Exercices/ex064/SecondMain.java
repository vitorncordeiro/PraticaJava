package dev.Main;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SecondMain {
    public static void main(String[] args) {

        UnaryOperator<String> test = (s) -> {
            String ans = "";
            for(int i =0; i< s.length(); i++){
                if(i % 2 == 1){
                    ans += s.charAt(i);
                }
            }
            return ans;
        };
        System.out.println(test.apply("1234567890"));

        String Sans = everySecondChar(test, "1234567890" );
        System.out.println(Sans);


        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
    public static String everySecondChar(UnaryOperator<String> function, String string){
        return function.apply(string);
    }
}
