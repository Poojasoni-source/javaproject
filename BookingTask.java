public class BookingTask implements Runnable{
    private BookingSystem system;
    private Customer customer;
    private Movie movie;
    private Seat seat;
    public BookingTask(BookingSystem system,Customer customer,Movie movie,Seat seat){
        this.system=system;
        this.customer=customer;
        this.movie=movie;
        this.seat=seat;
    }
    @Override 
    public void run(){
        system.bookTicket(customer,movie,seat);

    }

}