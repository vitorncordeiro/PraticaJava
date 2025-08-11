import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact newContact){
        if(findContact(newContact.getName()) == -1){
            myContacts.add(newContact);
            return true;
        }else{
            return false;
        }
        
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact) != -1){
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeContact(Contact oldContact){
        if(findContact(oldContact) != -1){
            myContacts.remove(findContact(oldContact));
            return true;
        }else{
            return false;
        }
    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String contact){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName() == contact){
                return i;
            }else{
                return -1;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName() == name){
                return myContacts.get(i);
            }
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for(int c = 0; c < myContacts.size(); c++){
            System.out.println((c + 1 )+ ". " + myContacts.get(c).getName() + " -> " + myContacts.get(c).getPhoneNumber());
        }
    }
}
