import java.util.ArrayList;
public class Theatre{
    private String theatreName;
    private ArrayList<Seat> seats;
    public Theatre(String theatreName){
        this.theatreName=theatreName;
        seats=new ArrayList<>();//initializing arraylist similar to list in python
    }
    public void addSeat(Seat seat){
        seats.add(seat);
    }
    public void displaySeats(){
        for (Seat seat : seats){
            seat.displayStatus();
        }

    }
   
}