import java.util.ArrayList;
import java.util.List;


public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    
    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getStrength(){
        return strength;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{name='%s', hitPoints=%d, strength=%d, weapon='%s'}"
        .formatted(name, hitPoints, strength, weapon);
    }
    @Override
    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(Integer.toString(hitPoints));
        list.add(Integer.toString(strength));
        list.add(weapon);
        return list;
    }
    @Override
    public void read(List<String> list){
        if(list != null && list.size() > 0){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
        
    
}
