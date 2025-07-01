public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeID = 1;

    public Employee(){
        this("Funcionário Anônimo", "01/01/1905",  "01/07/2026" );
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeID++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + "\n" + super.toString();
    }
}
