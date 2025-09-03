package code;

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
        @Override
        public String toString(){
            return seat;
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
        seats = new TreeSet<>();
        for(int i = 0; i <  totalSeats; i++){
            char rowChar = (char) (i/ seatsPerRow + (int) 'A');
            Seat current = new Seat(rowChar, (i + 1));
            seats.add(current);
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
}
