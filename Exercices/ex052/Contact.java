public class Contact {
    private String phoneNumber;
    private String name;
    
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        Contact contato = new Contact(name, phoneNumber);
        return contato;
    }
}
