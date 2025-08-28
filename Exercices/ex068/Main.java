package main2;

public class Main {
    public static void main(String[] args){
        Contact contact1 = new Contact("Vitor", "vitornc31@gmail.com", 1112223333);
        Contact contact2 = new Contact("Vitor", "vitornc31@gmail.com", 2223334444L);
        Contact contact3 = new Contact("Mickey", "mickeymouse@gmail.com", 9998887777L);

        System.out.println(contact1);
        contact1.mergeContactData(contact2);
        System.out.println(contact1);

    }
}
