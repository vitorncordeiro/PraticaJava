public class SalariedEmployee extends Employee{
    double anualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate,  String hireDate, double anualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.anualSalary = anualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        isRetired = true;
    }



    @Override
    public double collectPay() {
        return anualSalary / 26;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "anualSalary=" + anualSalary +
                ", isRetired=" + isRetired +
                ", endDate='" + endDate + '\'' +
                '}' +
                "\n" + super.toString();
    }
}
