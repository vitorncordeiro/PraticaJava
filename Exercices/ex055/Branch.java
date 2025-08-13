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
        if(findCustomer(customerName) != null){
            return false;
        }
        customers.add(new Customer(customerName, initialTransaction));
        return true;
    }
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer myC = findCustomer(customerName);
        
        if(myC == null){
            return false;
        }
        myC.addTransaction(transaction);
        return true;
    }
    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName() == customerName){
                return customers.get(i);
            }
        }
        return null;
    }
}
