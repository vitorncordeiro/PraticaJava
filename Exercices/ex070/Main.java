package code;

public class Main {
    public static void main(String[] args) {
        Theatre teste = new Theatre("Vitor", 10, 100);
        teste.getSeats().forEach(System.out::println);
    }

}
