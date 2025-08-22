package dev.ex.util;

import dev.ex.model.Student;

import java.util.Comparator;

public class CourseFilter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse().compareTo(o2.getCourse());
    }

}
