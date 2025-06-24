package ex033;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public String getFullName(){
        if (firstName == null && lastName == null){
            return "";
        }else if (firstName == null){
            return lastName;
        }else if (lastName == null){
            return firstName;
        }
        return firstName + " " + lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
