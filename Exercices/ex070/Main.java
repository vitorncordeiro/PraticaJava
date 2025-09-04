package code;

public class Main {
    public static void main(String[] args) {
        Theatre teste = new Theatre("Vitor", 5, 13);
        teste.getSeats().forEach(System.out::println);

        teste.reserve('A', 'B', 4);
        teste.getSeats().forEach(System.out::println);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        teste.reserve(3);
        teste.getSeats().forEach(System.out::println);


    }

}
