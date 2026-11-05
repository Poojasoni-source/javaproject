public class Main {

    public static void main(String[] args) {

        // Create Movie
        Movie movie = new Movie("Inception", "Sci-Fi", 148, 250.0);

        // Create Theatre
        Theatre theatre = new Theatre("Suncity");

        // Create Seats
        Seat s1 = new Seat("A1");
        Seat s2 = new Seat("A2");
        Seat s3 = new Seat("A3");

        // Add seats to Theatre
        theatre.addSeat(s1);
        theatre.addSeat(s2);
        theatre.addSeat(s3);

        // Create Customer
        Customer customer = new Customer(101, "Pooja", "9898989898");

        // Create Booking System
        BookingSystem system = new BookingSystem();

        // Display Movie
        movie.displayMovie();

        // Display available seats
        System.out.println("\nAvailable Seats:");
        theatre.displaySeats();

        // Book Ticket
        System.out.println("\nBooking Ticket:");
        system.bookTicket(customer, movie, s1);

        // Display All Bookings
        System.out.println("\nAll Bookings:");
        system.displayBookings();

        // Try booking the same seat again
        System.out.println("\nTrying to book the same seat:");
        system.bookTicket(customer, movie, s1);

        // Cancel Booking
        System.out.println("\nCancelling Booking:");
        system.cancelBooking(1001);

        // Display seats after cancellation
        System.out.println("\nSeats after cancellation:");
        theatre.displaySeats();
    }
}