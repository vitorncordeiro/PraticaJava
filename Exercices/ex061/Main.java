package dev.ex;

import dev.ex.model.LPAStudent;
import dev.ex.model.Student;
import dev.ex.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);


        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
//        printList(lpaStudents);

        var queryList = new QueryList<>(lpaStudents);

        Collections.sort(queryList);
        printMoreLists(queryList);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreLists(matches);

        var students2021 =
                queryList.getMatches("YearStarted", "2021");
        printMoreLists(students2021);


        System.out.println("AAAAAAAAAAA");
        System.out.println();

        Comparator courseF = new CourseFilter();

        queryList.sort(courseF);

        printMoreLists(queryList);

        Comparator courseY = new YearFilter();

        queryList.sort(courseY);
        printMoreLists(queryList);

        Comparator courseP = new PercentageFilter();

        queryList.sort(courseP);
        printMoreLists(queryList);

        System.out.println("------------------------");
        List<LPAStudent> students50 = queryList.getMatches("PER", "10");
        printMoreLists(students50);




//        QueryList<Employee> employeeList = new QueryList<>();

    }

    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
