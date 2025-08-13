import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        if(findBranch(name) != null){
            return false;
        }
        branches.add(new Branch(name));
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double inicialT){
        Branch myB = new Branch(branchName);
        
        if(myB.newCustomer(customerName, inicialT)){
            return true;
        }else{
            return false;
        }
        
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch myB = new Branch(branchName);
        
        if(myB.addCustomerTransaction(customerName, transaction)){
            return true;
        }
        return false;
        
    }
    
    
    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            if(branches[i].getName() == branchName){
                return branches[i];
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean printTransactions){
        
    }
    
}
