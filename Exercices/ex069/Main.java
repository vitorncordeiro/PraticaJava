package mm;

public class Main {
    public static void main(String[] args){
        TaskData teste = new TaskData();
        var test = teste.getTasks("bob");
        test.forEach(System.out::println);
    }
}
