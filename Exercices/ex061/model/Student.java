package dev.ex.model;

import dev.ex.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private String name;
    private String course;
    private int yearStarted;
    private String id;

    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        id = String.valueOf( random.nextInt(100000, 999999));
    }

    @Override
    public String toString() {
        return "%-15s %-15s %-15d %-15s".formatted(name, course, yearStarted, id);
    }

    public int getYearStarted() {
        return yearStarted;
    }
    public String getId(){
        return id;
    }
    public String getCourse(){
        return course;
    }
    @Override
    public int compareTo(Student target){
        return  this.id.compareTo(target.getId());
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }


}
