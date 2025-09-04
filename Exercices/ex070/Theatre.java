package code;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    public class Seat implements Comparable<Seat>{
        protected String seat;
        protected boolean isReserved;

        public Seat(String seat){
            this.seat = seat;
        }
        public Seat(char row, int col){
            if(col < 10){
                this.seat = String.valueOf(row) +  "00" + col;
            }else if(col < 100){
                this.seat = String.valueOf(row) +  "0" + col;
            }else{
                this.seat = String.valueOf(row) + col;
            }
        }
        public String getSeat(){
            return seat;
        }

        public boolean isReserved() {
            return isReserved;
        }

        public void setReserved(boolean reserved) {
            isReserved = reserved;
        }

        @Override
        public String toString(){
            return seat + " --- " + (isReserved ? "Reserved" : "Available");
        }

        @Override
        public int compareTo(Seat o) {
            return this.seat.compareTo(o.seat);
        }
    }


    private String name;
    private int seatsPerRow;
    private Set<Seat> seats;

    public Theatre(String name, int numOfRows, int totalSeats){

        this.name = name;
        this.seatsPerRow = totalSeats/numOfRows;
        int leftovers = totalSeats % seatsPerRow;
        seats = new TreeSet<>();
        char rowChar = 'A';
        for(int i = 0; i <  numOfRows; i++){
            rowChar = (char) (65 + i);

            for(int j= 0; j < seatsPerRow; j++){
                Seat current = new Seat(rowChar, (j + 1));
                seats.add(current);
            }

        }
        if(leftovers > 0){
            for (int i = seatsPerRow; i < leftovers + seatsPerRow;i++){
                seats.add(new Seat(rowChar, (i+1)));
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public Set<Seat> getSeats() {
        return seats;
    }
    public void reserve(char firstRow, char lastRow, int reservationsQuantity){

        for (int i = (int) firstRow; i <= (int)lastRow; i++){
            for(var seat : seats){
                if(seat.getSeat().toUpperCase().startsWith(String.valueOf(((char)i)))){
                    seat.setReserved(true);
                }

            }
        }

    }
    public void reserve(int reservationsQuantity){
        var listaSeats = new ArrayList<>(seats);
        for (int i = 0; i < reservationsQuantity; i++){
            listaSeats.get(i).setReserved(true);
        }

    }
}
