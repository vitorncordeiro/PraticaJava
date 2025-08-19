package dev.lpa;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Knight seiya = new Knight("Seiya", 18, "Bronze");
        Knight aldebaran = new Knight("Aldebaran", 20, "Gold");
        Knight shiryu = new Knight("Shiryu", 18, "Bronze");
        Knight yoga = new Knight("Yoga", 18, "Bronze");
        Knight marin = new Knight("Marin", 20, "Silver");

        List<Knight> list = new LinkedList<>();
        list.add(seiya);

        list.add(aldebaran);

        list.add(1, marin);

        list.remove(0);
        printList(list);
    }
    public static <T> void printList(List<T> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            System.out.println();
        }

    }
}


