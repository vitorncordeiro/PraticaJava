import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>(); 
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public String getName(){
        return name;
    }
    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName != null)){
            return false;
        }
        customers.add(new Customer(customerName, initialTransaction));
        return true;
    }
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer myC = new Customer(customerName, transaction);
        
        if(findCustomer(customerName == null)){
            return false;
        }
        myC.addTransaction(transaction);
        
    }
    private Customer findCustomer(String customerName){
        for(Customer c : customers){
            if(c.getName() == customerName){
                return c;
            }
        }
        return null;
    }
}
