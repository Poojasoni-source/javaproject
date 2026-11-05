public class Booking{
    private int bookingId;
    private Customer customer;
    private Movie movie;//classes are themselves datatypes and specify datatype for each 
    private Seat seat; 
    //HAS A relationship eg Booking HAS A customer, 
    //we are storing references to objects of other classes
    public Booking(int bookingId, Customer customer, Movie movie, Seat seat) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.movie = movie;
        this.seat=seat;
    }
    public void displayBooking(){
        System.out.println("Booking ID: "+ bookingId);
        System.out.println("customer name: "+customer.getCustomerName());
        System.out.println("Movie Name: "+ movie.getMovieName());
        System.out.println("Seat number: "+ seat.getSeatNumber());
    } 
   
    public int getBookingId(){
        return bookingId;
    }
    public Seat getSeat() {
    return seat;
}
}