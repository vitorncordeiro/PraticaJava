package dev.Main;

public enum Suit {
    DIAMOND,
    HEART,
    SPADE,
    CLUB;

    public char getImage(){
     return (new char[] {9830, 9829, 9824, 9827} ) [this.ordinal()];
    }
}
