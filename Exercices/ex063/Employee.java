package dev;

import java.time.LocalDate;

public record Employee(String firstName, String lastName, String hireDate) {
    @Override
    public String toString(){
        return "Full name: " + firstName + " " + lastName + "\n" + "Years working: " + (LocalDate.now().getYear()
                - Integer.parseInt(hireDate.substring(6)));
    }
}
