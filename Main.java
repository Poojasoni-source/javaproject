public class Main {

    public static void main(String[] args) {

        // Create Movie
        Movie movie = new Movie("Inception", "Sci-Fi", 148, 250.0);

        // Create Theatre
        Theatre theatre = new Theatre("Suncity");

        // Create Seats
        Seat s1 = new Seat("A1");
        
        
        // Create Customer
        Customer c1 = new Customer(101, "Pooja", "9898989898");
        Customer c2 = new Customer(102,"Yukti","9090909090");

        // Creating one shared Booking System
        BookingSystem system = new BookingSystem();      

        //creating two booking tasks for the same seat
        BookingTask task1 =new BookingTask(system,c1,movie,s1);
        BookingTask task2 =new BookingTask(system,c2,movie,s1);
        
        //create two threads
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);

        //start both threads
        t1.start();
        t2.start();

        //wait for both threads to finsih
        try{
            t1.join();//join() makes the current thread (here, main) wait until the specified thread finishes.
            t2.join();//Without join(), the main thread might display seat status before both booking threads have finished.

        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());

        }

        //dispay final saet status
        System.out.println(" final seat status");
        s1.displayStatus();

        //Display all successful bookings
        System.out.println("All bookings");
        system.displayBookings();


    }
}