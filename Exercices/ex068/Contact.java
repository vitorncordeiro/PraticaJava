package main2;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name){
        this(name, null, 0);
    }
    public Contact(String name, String email){
        this(name, email, 0);
    }
    public Contact(String name, long phone){
        this(name, null, phone);

    }
    public Contact(String name, String email, long phone){
        this.name = name;
        if(phone != 0){
            String fPhone = String.valueOf(phone);
            this.phones.add("(" + fPhone.substring(0, 3) + ")" + " " + fPhone.substring(3, 6) + "-" + fPhone.substring(6, 9));
        }
        if(email != null){
            this.emails.add(email);
        }

    }

    public String getName() {
        return name;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public Set<String> getPhones() {
        return phones;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nPhones: " + phones + "\nEmails: " + emails;
    }

    public void mergeContactData(Contact contact){
        this.emails.addAll(contact.getEmails());
        this.phones.addAll(contact.getPhones());

    }
}
