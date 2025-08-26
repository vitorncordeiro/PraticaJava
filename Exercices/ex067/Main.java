package dev.Main;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        for(int i =0; i < 4;i++){
            for(int j = 0; j < 13; j++){
                System.out.print(Card.getDefaultDeck().get(counter) + " ");

                counter++;
            }
            System.out.println();
        }

        System.out.println(Card.getFaceCard(Suit.HEART, "Q"));
        System.out.println(Card.getNumericCard(Suit.DIAMOND, 4));


    }
}

