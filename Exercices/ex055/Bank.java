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
        Branch existBranch = findBranch(branchName);
        if(existBranch != null){
            return existBranch.newCustomer(customerName, inicialT);
        }else{
            return false;
        }
        
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existBranch = findBranch(branchName);
        
        if(existBranch != null){
            return existBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
        
    }
    
    
    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName() == branchName){
                return branches.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch myB = findBranch(branchName);
        if(myB != null){

            System.out.println("Customer details for branch " + myB.getName());
            for(int i = 0; i < myB.getCustomers().size(); i++){
                System.out.println("Customer: " + myB.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                if(printTransactions){
                    System.out.println("Transactions");
                    for(int j = 0; j < myB.getCustomers().get(i).getTransactions().size(); j++){
                        System.out.println("[" + (j + 1) + "] Amount " +  myB.getCustomers().get(i).getTransactions().get(j));
                }
                }
            }
            return true;
        }
        return false;
    }
    
}
