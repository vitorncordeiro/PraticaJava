package dev.ex.util;

import dev.ex.model.Student;

import java.util.Comparator;

public class YearFilter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getYearStarted(), o2.getYearStarted());
    }
}
