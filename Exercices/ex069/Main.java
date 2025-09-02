package mm;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        TaskData teste = new TaskData();
        var test = teste.getTasks("all");
        test.forEach(System.out::println);
        var anotherTasks = teste.getAnotherTasks("all");
        test.forEach(System.out::println);

        System.out.println("-----\nUNIÃO\n");

        getUnion(test, anotherTasks).forEach(System.out::println);
        System.out.println("-----\nDIFERENÇA\n");
        getDifference(test, anotherTasks).forEach(System.out::println);
        System.out.println("-----\nINTERSECÇÃO\n");
        getIntersection(test, anotherTasks).forEach(System.out::println);
    }
    public static Set<Task> getUnion(Set<Task> a, Set<Task> b){
        Set<Task> union = new HashSet<>();
        union.addAll(a);
        union.addAll(b);
        return union;
    }
    public static Set<Task> getIntersection(Set<Task> a, Set<Task> b){
        Set<Task> intersec = new HashSet<>();
        intersec.addAll(a);
        intersec.retainAll(b);
        return intersec;
    }
    public static Set<Task> getDifference(Set<Task> a, Set<Task> b){
        Set<Task> difference = new HashSet<>();
        difference.addAll(a);
        Predicate<Task> isIn = b::contains;
        difference.removeIf(isIn);
        return difference;
    }
}


