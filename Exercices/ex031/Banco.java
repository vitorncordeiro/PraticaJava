public class Banco {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public void deposit(double value){
        balance = balance + value;
    }
    public void withdraw(double value){
        if (balance < value){
            System.out.println("Insuficiente");
            return;
        }
        balance = balance - value;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
