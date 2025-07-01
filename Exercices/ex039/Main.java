public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Vitor", "31/08/2007","04/07/2025", 9456.1, false);
        System.out.println(salariedEmployee.getAge());
        System.out.println(salariedEmployee.collectPay());
        System.out.println(salariedEmployee);

        System.out.println(" ");

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Vitor", "31/08/2000","04/07/2025", 312943.1, false);
        System.out.println(salariedEmployee2.getAge());
        System.out.println(salariedEmployee2.collectPay());
        System.out.println(salariedEmployee2);

    }
}
