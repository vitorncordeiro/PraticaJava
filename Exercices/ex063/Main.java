package dev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Employee vitor = new Employee("Vitor", "Natal C", "01/04/2022");
        Employee lauren = new Employee("Lau", "Natal C", "01/04/2022");
        Employee ivy = new Employee("Ivy", "Rafaello", "23/06/2020");
        Employee su = new Employee("Su", "Martins", "01/04/2016");

        var lista = putInList(vitor, ivy, su);
        for(var i : lista){
            System.out.println(i);
        }

        class Internal{
            int yearsWorked;
            String fullName;
            Employee employee;

            private Internal(Employee employee){
                this.employee = employee;
                this.yearsWorked = LocalDate.now().getYear()
                        - Integer.parseInt(employee.hireDate().substring(6));
                this.fullName = employee.firstName() + employee.lastName();
            }

            @Override
            public String toString(){
                return "Full name: " + fullName + "\nYears working: " + yearsWorked;
            }
        }
        Internal internal1 = new Internal(vitor);
        Internal internal2 = new Internal(su);
        Internal internal3 = new Internal(ivy);
        Internal internal4 = new Internal(lauren);
        List<Internal> lista2 = putInList(internal1, internal2, internal3, internal4);
        lista2.sort(new Comparator<Internal>() {
            @Override
            public int compare(Internal o1, Internal o2) {
                if(Integer.compare(o1.yearsWorked, o2.yearsWorked) == 0){
                   return o1.fullName.compareTo(o2.fullName);
                }
                return Integer.compare(o1.yearsWorked, o2.yearsWorked);
            }



        });
        for(var i : lista2){
            System.out.println(i);
        }

    }


    public static <T> List<T>  putInList(T... valores){
        List<T> lista = new ArrayList<>();
        for(var i : valores){
            lista.add(i);
        }
        return lista;
    }

}
