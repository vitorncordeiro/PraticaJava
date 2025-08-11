import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record City(String name, double distance){
    @Override
    public String toString() {
        return "City: " + name + ", distance: " + distance + "km";
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<City> places = new LinkedList<>();
        addCity(new City("Curitiba", 0), places);
        addCity(new City("Pinhais", 7.9), places);
        addCity(new City("Florianópolis", 305.8), places);
        addCity(new City("São Paulo", 402.2), places);
        addCity(new City("Foz Do Iguaçu", 630.1), places);

        ListIterator<City> iterator = places.listIterator();
        boolean flag = true;
        while (flag) {
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
            }
            System.out.println("Select an option:");
            menu();
            String option = sc.nextLine();
            switch (option) {

                case "F", "f":
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }else{
                        System.out.println("Cant go foward");
                    }
                    break;

                case "B", "b":
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }else{
                        System.out.println("Cant go backward");
                    }
                    break;
                case "L", "l":
                    for(City city : places) {
                        System.out.print(city + " | ");
                    }
                    break;
                case "Q", "q":
                    sc.close();
                    flag = false;
                    break;

            }
        }





    }
    public static void addCity(City city, LinkedList<City> places){
        if(places.contains(city)){
            System.out.println("City already exists");
            return;
        }
        int match = 0;
        for(int i = 0; i < places.size(); i++){
            if(places.get(i).distance() > city.distance()){
                places.add(match, city);
                return;
            }
            match++;
        }
        places.add(city);
    }
    public static void menu(){
        System.out.println("(F)orward\n(B)ackward\n(L)ist Places\n(M)enu\n(Q)uit");
    }


}
