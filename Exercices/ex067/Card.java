package dev.Main;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {


    @Override
    public String toString(){

        return face + " " + suit.getImage() + "(" + rank + ")";
    }
    public static Card getNumericCard(Suit suit, int number){
        return new Card(suit, String.valueOf(number), number - 2);
    }
    public static Card getFaceCard(Suit suit, String face){
        int rank = -1;
        switch (face.toUpperCase()){
            case "J" -> rank = 9;
            case "Q" -> rank = 10;
            case "K" -> rank = 11;
            case "A" -> rank = 12;
        }
        return new Card(suit, face, rank);
    }
    public static List<Card> getDefaultDeck(){
        List<Card> cardList = new ArrayList<>();
        for(int i = 0; i < Suit.values().length;i++){
            for(int j = 0; j < 13;j++){
                String face = "";
                switch (j){
                    case 9 -> face = "J";
                    case 10 -> face = "Q";
                    case 11 -> face = "K";
                    case 12 -> face = "A";
                    default -> face = String.valueOf(j + 2);
                }
                cardList.add(new Card(Suit.values()[i], face, j));
            }
        }
        return cardList;
    }
}
