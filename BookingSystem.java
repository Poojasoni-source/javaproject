import java.util.ArrayList;

public class BookingSystem {

    private ArrayList<Booking> bookings;//stores all booking objects
    private int bookingCounter;//generates unique bookingIds

    public BookingSystem() {
    this.bookingCounter = 1000;
    bookings = new ArrayList<>();
}
public int generateBookingId(){
    return ++bookingCounter;}
public void bookTicket(Customer customer, Movie movie,Seat seat){
    if (seat.getIsBooked()) {
        System.out.println("Seat already booked!");
    }
    else {
        seat.bookSeat();

        int id = generateBookingId();

        Booking booking = new Booking(id, customer, movie, seat);
        //This is object composition. We're combining objects from previously created classes to create one booking.

        bookings.add(booking);

        booking.displayBooking();
    }


}
public void displayBookings() {
    for (Booking booking : bookings) {
        booking.displayBooking();
    }
}
public void cancelBooking(int bookingId){
for (Booking booking : bookings) {

        if (booking.getBookingId() == bookingId) {

            booking.getSeat().cancelSeat();//accesses the seat associated with the booking and makes it available again.

            bookings.remove(booking);//removes that booking from the ArrayList.

            System.out.println("Booking cancelled successfully!");
            return;
        }
    }

    System.out.println("Booking not found!");
}
}

