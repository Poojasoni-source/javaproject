public class Seat{
    private String seatNumber;
    private boolean isBooked=false;
    public Seat(String seatNumber){
        this.seatNumber=seatNumber;
    }
    public String getSeatNumber(){
        return seatNumber;
    public void displayStatus(){
        System.out.println("seatNumber: "+ seatNumber);
        
        if(isBooked){
            System.out.println("Seat is booked");
        }
        else{
            System.out.println("Seat is Available");
        }
        
    }
    public void bookSeat() {
    if (isBooked) {
        System.out.println("Sorry, seat already booked!");
    }
    else {
        isBooked = true;
        System.out.println("Seat booked successfully!");
    }
}
    public static void main(String[] args){
        Seat seatNumb=new Seat("23");
        seatNumb.displayStatus();
        seatNumb.bookSeat();
        seatNumb.displayStatus();
        seatNumb.bookSeat();
    }
}