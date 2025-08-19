package dev.lpa;

public class Knight {
    private String name;
    private int age;
    private String armorType;

    public Knight(String name, int age, String armorType){
        this.name = name;
        this.age = age;
        this.armorType = armorType;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getArmorType(){
        return armorType;
    }
    @Override
    public String toString(){
        return "Knight: " + name + "\nAge: " + age + "\nArmor Type: " + armorType;
    }

}
