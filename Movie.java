//this class stores info about a movie
public class Movie{
    private String movieName;
    private String movieGenre;
    private int duration;
    private double ticketPrice;
    public Movie(String movieName,String genre,int duration, double ticketPrice){
        this.movieName = movieName;
        this.movieGenre = genre;
        this.duration = duration;//this is used to refer to objects variable
        this.ticketPrice = ticketPrice;
    }
    public void displayMovie(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Ticket Price: Rs." + ticketPrice);
    }
    public String getMovieName(){
        return movieName;//getMovieName is getter method
    }
    public double getTicketPrice(){
        return ticketPrice;
    }
    public static void main(String[] args){
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148, 250.00);
        movie1.displayMovie();
    }
}
